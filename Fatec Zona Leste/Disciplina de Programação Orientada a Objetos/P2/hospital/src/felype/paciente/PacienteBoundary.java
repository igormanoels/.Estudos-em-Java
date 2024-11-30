package felype.paciente;

import java.time.LocalDate;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import tela.Menu;

public class PacienteBoundary {

    protected Label lblId = new Label("");
    protected TextField txtNome = new TextField("");
    protected DatePicker dateCadastro = new DatePicker(LocalDate.now());
    protected TextField txtEndereco = new TextField("");
    protected TextField txtTelefone = new TextField("");
    protected TextField txtEmail = new TextField("");
    protected TextField txtCartaoSus = new TextField();

    protected TableView<Paciente> tableView = new TableView<>();

    private PacienteControl control;// = new PacienteControl();

    public Scene telaPaciente(Stage stage, Menu menu) {

        try {
            control = new PacienteControl();
        } catch (PacienteException er) {
            alert(AlertType.ERROR, "Erro ao inicializar sistema");
        }

        BorderPane panePrincipal = new BorderPane();
        GridPane paneForm = new GridPane();
        paneForm.getStyleClass().add("grid-pane");


        paneForm.add(new Label("Id: "), 0, 0);
        paneForm.add(lblId, 1, 0);
        paneForm.add(new Label("Nome: "), 0, 1);
        paneForm.add(txtNome, 1, 1);
        paneForm.add(new Label("Telefone: "), 0, 2);
        paneForm.add(txtTelefone, 1, 2);
        paneForm.add(new Label("Email: "), 0, 3);
        paneForm.add(txtEmail, 1, 3);
        paneForm.add(new Label("Nascimento: "), 0, 4);
        paneForm.add(dateCadastro, 1, 4);
        paneForm.add(new Label("Endereco: "), 0, 5);
        paneForm.add(txtEndereco, 1, 5);
        paneForm.add(new Label("Cartao: "), 0, 6);
        paneForm.add(txtCartaoSus, 1, 6);

        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction(e -> {
            try {
                control.gravar();
                tableView.refresh();
            } catch (PacienteException er) {
                alert(AlertType.ERROR, "Erro ao gravar");
            }
        });

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> control.pesquisarPorNome());

        Button btnLimpar = new Button("Limpar");
        btnLimpar.setOnAction(e -> control.limparTudo());
                
        Button btnVoltar = new Button("Voltar");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

        paneForm.add(btnVoltar, 0, 7);
        paneForm.add(btnGravar, 1, 7);
        paneForm.add(btnPesquisar, 2, 7);
        paneForm.add(btnLimpar, 3, 7);

        generateColumns();
        vincularPropriedes();

        panePrincipal.setTop(paneForm);
        panePrincipal.setCenter(tableView);

        Scene scn = new Scene(panePrincipal, 1000, 600);
        paneForm.getStylesheets().add(getClass().getResource("/css/estiloPaciente.css").toExternalForm());
        stage.setScene(scn);
        stage.setTitle("Sistema Hospitalar: Cadastro de Pacientes");
        return scn;
    }

    @SuppressWarnings("unchecked")
    public void generateColumns() {
        TableColumn<Paciente, Integer> col1 = new TableColumn<>("Id");
        col1.setCellValueFactory(new PropertyValueFactory<Paciente, Integer>("id"));

        TableColumn<Paciente, String> col2 = new TableColumn<>("Nome");
        col2.setCellValueFactory(new PropertyValueFactory<Paciente, String>("nome"));

        TableColumn<Paciente, String> col3 = new TableColumn<>("Email");
        col3.setCellValueFactory(new PropertyValueFactory<Paciente, String>("email"));

        TableColumn<Paciente, String> col4 = new TableColumn<>("Telefone");
        col4.setCellValueFactory(new PropertyValueFactory<Paciente, String>("telefone"));

        TableColumn<Paciente, LocalDate> col5 = new TableColumn<>("Cadastro");
        col5.setCellValueFactory(new PropertyValueFactory<Paciente, LocalDate>("cadastro"));

        TableColumn<Paciente, String> col6 = new TableColumn<>("Endereco");
        col6.setCellValueFactory(new PropertyValueFactory<Paciente, String>("endereco"));

        TableColumn<Paciente, String> col7 = new TableColumn<>("Cartao SUS");
        col7.setCellValueFactory(new PropertyValueFactory<Paciente, String>("cartaoSus"));

        Callback<TableColumn<Paciente, Void>, TableCell<Paciente, Void>> callback = new Callback<>() {
            @Override
            public TableCell<Paciente, Void> call(TableColumn<Paciente, Void> param) {
                TableCell<Paciente, Void> tc = new TableCell<>() {
                    final Button btnExcluir = new Button("Apagar");
                    {
                        btnExcluir.setOnAction(e -> {
                            try {
                                Paciente p = tableView.getItems().get(getIndex());
                                control.excluir(p);
                            } catch (PacienteException er) {
                                alert(AlertType.ERROR, "Erro ao excluir");
                            }
                        });
                    }

                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btnExcluir);
                        }
                    }
                };
                return tc;
            }
        };

        TableColumn<Paciente, Void> col8 = new TableColumn<>("Ações");
        col8.setCellFactory(callback);

        tableView.getColumns().addAll(col1, col2, col3, col4, col5, col6, col7, col8);
        tableView.setItems(control.getLista());

        tableView.getSelectionModel().selectedItemProperty()
                .addListener((obs, antigo, novo) -> {
                    System.out.println("Selecionado o paciente ==> " + novo);
                    control.entidadeParaTela(novo);
                });
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public void vincularPropriedes() {
        Bindings.bindBidirectional(lblId.textProperty(), control.idProperty(),
                (StringConverter) new IntegerStringConverter());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
        Bindings.bindBidirectional(txtEmail.textProperty(), control.emailProperty());
        Bindings.bindBidirectional(txtTelefone.textProperty(), control.telefoneProperty());
        Bindings.bindBidirectional(dateCadastro.valueProperty(), control.cadastroProperty());
        Bindings.bindBidirectional(txtEndereco.textProperty(), control.enderecoProperty());
        Bindings.bindBidirectional(txtCartaoSus.textProperty(), control.cartaoSusProperty());
    }

    public void alert(AlertType tipo, String msg) {
        Alert alertWindow = new Alert(tipo);
        alertWindow.setHeaderText("Alerta");
        alertWindow.setContentText(msg);
        alertWindow.showAndWait();
    }
}
