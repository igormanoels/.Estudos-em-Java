package view;


import java.time.LocalDate;

import control.ApuracaoControl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Apuracao;

public class ApuracaoView {

    private ApuracaoControl control = new ApuracaoControl(this);
    public ObservableList<Apuracao> dadosApuracao = FXCollections.observableArrayList();
    public DatePicker dataApuracao = new DatePicker(LocalDate.now());
    private Alert confimar = new Alert(Alert.AlertType.CONFIRMATION);
    private ButtonType btnSim = new ButtonType("Sim");
    private ButtonType btnNao = new ButtonType("Não");


    @SuppressWarnings("unchecked")
    public Scene telaApuracao (Stage stage, Menu menu) {
        if (control.verificar()) {
            GridPane grid = new GridPane();
            grid.getStyleClass().add("grid-pane");
            Scene principal = new Scene(grid, 1024, 768);

            TableView<Apuracao> tabela = new TableView<>();
            TableColumn<Apuracao, Integer> colNum = new TableColumn<>("Número");
            TableColumn<Apuracao, String> colNome = new TableColumn<>("Nome");
            TableColumn<Apuracao, String> colCpf = new TableColumn<>("CPF");
            TableColumn<Apuracao, LocalDate> colNasc = new TableColumn<>("Nascimento");
            TableColumn<Apuracao, String> colEstado = new TableColumn<>("Estado");
            TableColumn<Apuracao, String> colPartido = new TableColumn<>("Partido");
            TableColumn<Apuracao, Integer> colVotos = new TableColumn<>("Total de Votos");
            TableColumn<Apuracao, LocalDate> colDataApuracao = new TableColumn<>("Data da Apuração");

            colNum.setCellValueFactory(new PropertyValueFactory<>("numero"));
            colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            colCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
            colNasc.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
            colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
            colPartido.setCellValueFactory(new PropertyValueFactory<>("nomePartido"));
            colVotos.setCellValueFactory(new PropertyValueFactory<>("quantidadeVotos"));
            colDataApuracao.setCellValueFactory(new PropertyValueFactory<>("dataApuracao"));

    
            tabela.getColumns().addAll(colNum, colNome, colCpf, colNasc, colEstado, colPartido, colVotos, colDataApuracao);
            tabela.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            tabela.setPrefWidth(1000);
            tabela.setPrefHeight(600);
            GridPane.setColumnSpan(tabela, 7);
            grid.add(tabela, 0, 0);
            tabela.setItems(dadosApuracao);

            grid.setHgap(10);
            grid.setVgap(15);
            grid.setPadding(new Insets(20));

            Button btnVoltar = new Button("Menu");
            btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

            Button btnApurar = new Button("Apuração");
            btnApurar.setOnAction(e -> control.contarVotos());

            Button btnBuscarApuracao = new Button("Buscar");
            btnBuscarApuracao.setOnAction(e -> control.BuscarApuracao());

            Button btnBuscarApuracaoTodos = new Button("Todos");
            btnBuscarApuracaoTodos.setOnAction(e -> control.BuscarApuracaoTodos());

            Button btnLimpar = new Button("Limpar");
            btnLimpar.setOnAction(e -> limparTela());

            Button btnLimparSistema = new Button("Resetar");
            btnLimparSistema.setOnAction(e -> {
                confimar.setTitle("Resetar Sistema! Essa ação é irreversível!");
                confimar.setHeaderText("Ao resetar o sistema, todos os dados de votação, incluindo Partidos, "
                    + "Candidatos, Votos e Apuração serão apagados do sistema.");
                confimar.setContentText("Você tem certeza que deseja apagar o sistema?");
                confimar.getButtonTypes().setAll(btnSim, btnNao);
                confimar.showAndWait().ifPresent(resp -> {
                    if (resp == btnSim) {
                        control.LimparSistema();
                    }
                });
            });

            HBox botoes = new HBox(15);
            botoes.getChildren().addAll(btnVoltar, btnApurar, btnBuscarApuracao, dataApuracao,
                btnBuscarApuracaoTodos, btnLimpar, btnLimparSistema);
                botoes.setAlignment(Pos.CENTER); 
            grid.add(botoes, 0, 7, 7, 1);


            principal.getStylesheets().add(getClass().getResource("/css/estiloCandidato.css").toExternalForm());
            stage.setTitle("Sistema de Votação: Apuração");
            return principal;
        } else {
            return menu.telaPrincipal(stage);
        }
    }

    public void limparTela() {
        this.dataApuracao.setValue(LocalDate.now());
        this.dadosApuracao.clear();
    }
    

    
}
