package felype.agendamento;

import java.time.LocalDate;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class AgendamentoBoundary{

    protected Label lblId = new Label("");
    protected TextField txtTipoExame = new TextField("");
    protected DatePicker txtDataCriacao = new DatePicker(LocalDate.now());
    protected TextField txtStatus = new TextField("");
    protected TextField txtMedicoResponsavel = new TextField("");
    protected TextField txtUnidadeExame = new TextField("");
    protected TextField txtObservacoes = new TextField();
    protected TextField txtFormaPagamento = new TextField();

    protected TableView<Agendamento> tableView = new TableView<>();

    private AgendamentoControl control = new AgendamentoControl();

    public Scene agendamentoConsulta(Stage stage, Menu menu) { 
        BorderPane panePrincipal = new BorderPane();
        GridPane paneForm = new GridPane();
        paneForm.getStyleClass().add("grid-pane");
        Scene scn = new Scene(panePrincipal, 1000, 600);


        paneForm.add(new Label("Id: "), 0, 0);
        paneForm.add(lblId, 1, 0);
        paneForm.add(new Label("Tipo de Exame: "), 0, 1);
        paneForm.add(txtTipoExame, 1, 1);
        paneForm.add(new Label("Data agendamento: "), 0, 2);
        paneForm.add(txtDataCriacao, 1, 2);
        paneForm.add(new Label("Status: "), 0, 3);
        paneForm.add(txtStatus, 1, 3);
        paneForm.add(new Label("Médico: "), 0, 4);
        paneForm.add(txtMedicoResponsavel, 1, 4);
        paneForm.add(new Label("Unidade: "), 0, 5);
        paneForm.add(txtUnidadeExame, 1, 5);
        paneForm.add(new Label("Observações: "), 0, 6);
        paneForm.add(txtObservacoes, 1, 6);
        paneForm.add(new Label("Pagamento: "), 0, 7);
        paneForm.add(txtFormaPagamento, 1, 7);

        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction( e -> {
            control.gravar();
            tableView.refresh();
        });
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction( e ->control.pesquisarPorUnidadeExame());

        Button btnLimpar = new Button("Limpar");
        btnLimpar.setOnAction( e -> control.limparTudo() );
      
        Button btnVoltar = new Button("Voltar");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        
        paneForm.add(btnVoltar, 0, 7);        
        paneForm.add(btnGravar, 1, 7);
        paneForm.add(btnPesquisar, 2, 7);
        paneForm.add(btnLimpar, 3, 7);

        scn.getStylesheets().add(getClass().getResource("/css/estiloAgendamento.css").toExternalForm());
        paneForm.getStyleClass().add("grid-pane");

        panePrincipal.setTop(paneForm);
        panePrincipal.setCenter(tableView);

        stage.setScene(scn);
        stage.setTitle("Sistema Hospitalar: Agendamento de Exames");
        return scn;
    }

}