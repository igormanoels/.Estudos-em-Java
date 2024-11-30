package thiago.cruds.gestaoPedidos.estoque;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tela.Menu;

public class EstoqueBoundary {

    private EstoqueControl control;

    private TextField txtId = new TextField();
    private TextField txtMedicamento = new TextField();
    private TextField txtQuantidade = new TextField();
    private TextField txtFornecedor = new TextField();
    private TextField txtFuncionarioRegistro = new TextField();

    private TableView<Estoque> table = new TableView<>();

    public EstoqueBoundary() {
        try {
            control = new EstoqueControl();
        } catch (EstoqueException e) {
            e.printStackTrace();
        }
    }

    public Scene telaEstoque(Stage stage, Menu menu) {
        BorderPane panePrincipal = new BorderPane();
        VBox vboxForm = gerarFormulario(stage, menu);
        panePrincipal.setTop(vboxForm);

        table = gerarTabela();
        panePrincipal.setCenter(table);

        Scene scene = new Scene(panePrincipal, 1000, 600);
        stage.setTitle("Sistema Hospitalar: Gestão de Estoque");
        return scene;
    }

    private VBox gerarFormulario(Stage stage, Menu menu) {
        GridPane grid = new GridPane();        
        grid.getStyleClass().add("grid-pane");

        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label lblId = new Label("ID:");
        txtId.setEditable(false);
        grid.add(lblId, 0, 0);
        grid.add(txtId, 1, 0);

        Label lblMedicamento = new Label("Medicamento:");
        grid.add(lblMedicamento, 0, 1);
        grid.add(txtMedicamento, 1, 1);

        Label lblQuantidade = new Label("Quantidade:");
        grid.add(lblQuantidade, 0, 2);
        grid.add(txtQuantidade, 1, 2);

        Label lblFornecedor = new Label("Fornecedor:");
        grid.add(lblFornecedor, 0, 3);
        grid.add(txtFornecedor, 1, 3);

        Label lblFuncionarioRegistro = new Label("ID Funcionário:");
        grid.add(lblFuncionarioRegistro, 0, 4);
        grid.add(txtFuncionarioRegistro, 1, 4);

        Button btnSalvar = new Button("Salvar");
        btnSalvar.setOnAction(e -> {
            try {
                control.gravar();
            } catch (EstoqueException ex) {
                ex.printStackTrace();
            }
        });

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> {
            try {
                control.pesquisarPorMedicamento();
            } catch (EstoqueException ex) {
                ex.printStackTrace();
            }
        });

        Button btnLimpar = new Button("Limpar");
        btnLimpar.setOnAction(e -> control.limparTudo());

        Button btnVoltar = new Button("Voltar ao menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        
        
        grid.add(btnVoltar, 0, 5);
        grid.add(btnSalvar, 1, 5);
        grid.add(btnPesquisar, 2, 5);
        grid.add(btnLimpar, 3, 5);

        grid.getStylesheets().add(getClass().getResource("/css/estiloEstoque.css").toExternalForm());
        VBox vbox = new VBox(grid);
        vbox.setPadding(new Insets(10));
        return vbox;
    }

    @SuppressWarnings("unchecked")
    private TableView<Estoque> gerarTabela() {
        TableColumn<Estoque, Number> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(data -> Bindings.createObjectBinding(() -> data.getValue().getId()));

        TableColumn<Estoque, String> colMedicamento = new TableColumn<>("Medicamento");
        colMedicamento.setCellValueFactory(data -> Bindings.createObjectBinding(() -> data.getValue().getMedicamento()));

        TableColumn<Estoque, Number> colQuantidade = new TableColumn<>("Quantidade");
        colQuantidade.setCellValueFactory(data -> Bindings.createObjectBinding(() -> data.getValue().getQuantidade()));

        TableColumn<Estoque, String> colFornecedor = new TableColumn<>("Fornecedor");
        colFornecedor.setCellValueFactory(data -> Bindings.createObjectBinding(() -> data.getValue().getFornecedor()));

        TableColumn<Estoque, Number> colFuncionario = new TableColumn<>("ID Funcionário");
        colFuncionario.setCellValueFactory(data -> Bindings.createObjectBinding(() -> data.getValue().getFuncionarioRegistro()));

        TableColumn<Estoque, Void> colExcluir = new TableColumn<>("Ações");
        colExcluir.setCellFactory(param -> new TableCell<>() {
            private final Button btnExcluir = new Button("Excluir");

            {
                btnExcluir.setOnAction(e -> {
                    Estoque item = getTableView().getItems().get(getIndex());
                    try {
                        control.excluir(item);
                    } catch (EstoqueException ex) {
                        ex.printStackTrace();
                    }
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(btnExcluir);
                }
            }
        });

        table.getColumns().addAll(colId, colMedicamento, colQuantidade, colFornecedor, colFuncionario, colExcluir);
        table.setItems(control.getLista());
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null) {
                control.entidadeParaTela(newValue);
            }
        });

        return table;
    }
}
