package view;


import java.time.LocalDate;

import control.ApuracaoControl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
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
            GridPane.setColumnSpan(tabela, 9);
            grid.add(tabela, 0, 0);
            tabela.setItems(dadosApuracao);



            Button btnVoltar = new Button("Voltar ao Menu");
            grid.add(btnVoltar, 0, 7);
            btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));


            Button btnApurar = new Button("Apurar Votos");
            grid.add(btnApurar, 1, 7);
            btnApurar.setOnAction(e -> control.contarVotos());


            Button btnBuscarApuracao = new Button("Buscar");
            grid.add(btnBuscarApuracao, 2, 7);
            //GridPane.setColumnSpan(btnBuscarApuracao, 2);
            grid.add(dataApuracao, 6, 1);
            btnBuscarApuracao.setOnAction(e -> control.BuscarApuracao());
            
            
            Button btnLimpar = new Button("Limpar Tela");
            grid.add(btnLimpar, 3, 7);
            btnLimpar.setOnAction(e -> limparTela());

            Button btnLimparSistema = new Button("Resetar Sistema");
            grid.add(btnLimparSistema, 5, 7);
            
            btnLimparSistema.setOnAction(e -> {
                confimar.setTitle("Resetar Sistema! Essa ação é irreversível!");
                confimar.setHeaderText("Ao resetar o sistema, todos os dados de votação, incluindo o Partidos, "
                    + "Candidatos e Votos e Apuração serão apagados do sistema. ");
                confimar.setContentText("Você tem certeza que deseja apagar o sistema?");
                confimar.getButtonTypes().setAll(btnSim, btnNao);
                confimar.showAndWait().ifPresent(resp -> {
                    if (resp == btnSim) {
                        control.LimparSistema();
                    }
                });
            });


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
