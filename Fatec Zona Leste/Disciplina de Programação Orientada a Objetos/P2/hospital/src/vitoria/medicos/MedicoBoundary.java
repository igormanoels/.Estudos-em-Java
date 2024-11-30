package vitoria.medicos;

import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
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


public class MedicoBoundary {

    private Label lbId = new Label("");
    private TextField txtCrm = new TextField("");
    private TextField txtNome = new TextField("");
    private TextField txtEmail = new TextField("");
    private TextField txtTelefone = new TextField("");
    private TextField txtEspecialidade = new TextField("");

    private TableView<Medico> tableView = new TableView<>();
    private MedicoControl control;

    public Scene telaMedico(Stage stage, Menu menu) {

        try {
            control = new MedicoControl();
        } catch (MedicoException er) {
             alert(AlertType.ERROR, "Erro ao incializar sistema");
        }

        BorderPane panePrincipal = new BorderPane();
        GridPane paneForm = new GridPane();
        paneForm.getStyleClass().add("grid-pane");


        paneForm.add(new Label("Id: "), 0, 0);
        paneForm.add(lbId, 1, 0);
        paneForm.add(new Label("CRM: "), 0, 1);
        paneForm.add(txtCrm, 1, 1);
        paneForm.add(new Label("Nome: "), 0, 2);
        paneForm.add(txtNome, 1, 2);
        paneForm.add(new Label("Telefone: "), 0, 3);
        paneForm.add(txtTelefone, 1, 3);
        paneForm.add(new Label("Email: "), 0, 4);
        paneForm.add(txtEmail, 1, 4);
        paneForm.add(new Label("Especialidade: "), 0, 5);
        paneForm.add(txtEspecialidade, 1, 5);

        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction(
                e -> {
                    try {
                        control.gravar();
                        tableView.refresh();
                    } catch (MedicoException er) {
                        alert(AlertType.ERROR, "Erro ao gravar");
                    }
                });
        
                Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> {
            try {
                control.pesquisarPorNome();
            } catch (MedicoException er) {
                alert(AlertType.ERROR, "Erro ao pesquisar");
            }
        });

        Button btnLimpar = new Button("Limpar");
        btnLimpar.setOnAction(e -> control.limparTudo());

        Button btnVoltar = new Button("Voltar");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        
        
        paneForm.add(btnVoltar, 0, 6);
        paneForm.add(btnLimpar, 1, 6);
        paneForm.add(btnGravar, 2, 6);
        paneForm.add(btnPesquisar, 3, 6);


        generateColumns();
        vincularPropriedes();

        panePrincipal.setTop(paneForm);
        panePrincipal.setCenter(tableView);

        try {
            control.pesquisarTodos();
        } catch (MedicoException er) {
            alert(AlertType.ERROR, "Erro banco sem dados inseridos");
        }

        paneForm.getStylesheets().add(getClass().getResource("/css/estiloMedico.css").toExternalForm());
        Scene scn = new Scene(panePrincipal, 1000, 600);
        stage.setScene(scn);
        stage.setTitle("Sistema Hospitalar: Cadastro de Medicos");
        return scn;
    }

    @SuppressWarnings("unchecked")
    public void generateColumns() {

        // Cria Colunas
        TableColumn<Medico, Integer> col1 = new TableColumn<>("Id");
        col1.setCellValueFactory(new PropertyValueFactory<Medico, Integer>("id"));

        TableColumn<Medico, String> col2 = new TableColumn<>("CRM");
        col2.setCellValueFactory(new PropertyValueFactory<Medico, String>("crm"));

        TableColumn<Medico, String> col3 = new TableColumn<>("Nome");
        col3.setCellValueFactory(new PropertyValueFactory<Medico, String>("nome"));

        TableColumn<Medico, String> col4 = new TableColumn<>("Telefone");
        col4.setCellValueFactory(new PropertyValueFactory<Medico, String>("telefone"));

        TableColumn<Medico, String> col5 = new TableColumn<>("Email");
        col5.setCellValueFactory(new PropertyValueFactory<Medico, String>("email"));

        TableColumn<Medico, String> col6 = new TableColumn<>("Especialidade");
        col6.setCellValueFactory(new PropertyValueFactory<Medico, String>("especialidade"));

        Callback<TableColumn<Medico, Void>, TableCell<Medico, Void>> callback = new Callback<>() {
            @Override
            public TableCell<Medico, Void> call(TableColumn<Medico, Void> param) {
                TableCell<Medico, Void> tc = new TableCell<>() {
                    final Button btnExcluir = new Button("Apagar");
                    {
                        btnExcluir.setOnAction(
                                e -> {
                                    try {
                                        Medico m = tableView.getItems().get(getIndex());
                                        control.excluir(m);
                                    } catch (MedicoException er) {
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

        TableColumn<Medico, Void> col7 = new TableColumn<>("Ações");
        col7.setCellFactory(callback);

        tableView.getColumns().addAll(col1, col2, col3, col4, col5, col6, col7);
        tableView.setItems(control.getLista());

        tableView.getSelectionModel().selectedItemProperty()
                .addListener((obs, antigo, novo) -> {
                    System.out.println("Selecionado o medico ==> " + novo);
                    control.entidadeParaTela(novo);
                });
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void vincularPropriedes() {
        // Id
        Bindings.bindBidirectional(lbId.textProperty(), control.idProperty(),
        (StringConverter) new IntegerStringConverter());
        Bindings.bindBidirectional(txtCrm.textProperty(), control.crmProperty());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
        Bindings.bindBidirectional(txtTelefone.textProperty(), control.telefoneProperty());
        Bindings.bindBidirectional(txtEmail.textProperty(), control.emailProperty());
        Bindings.bindBidirectional(txtEspecialidade.textProperty(), control.especialidadeProperty());
    }

    public void alert(AlertType tipo, String msg) {
        Alert alertWindow = new Alert(tipo);
        alertWindow.setHeaderText("Alerta");
        alertWindow.setContentText(msg);
        alertWindow.showAndWait();
    }

}