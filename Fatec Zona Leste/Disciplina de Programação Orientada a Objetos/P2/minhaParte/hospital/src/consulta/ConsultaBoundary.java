package consulta;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class ConsultaBoundary {

    // Campos de texto para a interface
    protected TextField txtAgendamentoId = new TextField();
    protected TextField txtDescricao = new TextField();
    protected TextField txtMedicoCrm = new TextField();
    protected TextField txtEspecialidadeId = new TextField();
    
    // Controle de ações
    private ConsultaControl control = new ConsultaControl(this); 
    
    public Scene telaConsulta(Stage stage, Menu menu) {
        // Layout principal
        GridPane grid = new GridPane();
        grid.getStyleClass().add("grid-pane");
        Scene consulta = new Scene(grid, 1000, 600);

        // Labels e campos de texto para os dados da consulta
        grid.add(new Label("Agendamento ID: "), 0, 0);
        grid.add(new Label("Descrição: "), 0, 1);
        grid.add(new Label("CRM Médico: "), 0, 2);
        grid.add(new Label("Especialidade ID: "), 0, 3);

        grid.add(txtAgendamentoId, 1, 0);
        grid.add(txtDescricao, 1, 1);
        grid.add(txtMedicoCrm, 1, 2);
        grid.add(txtEspecialidadeId, 1, 3);

        // Botões de ação
        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction(e -> control.gravar());
        grid.add(btnGravar, 0, 4);

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> control.pesquisar());
        grid.add(btnPesquisar, 1, 4);

        Button btnAlterar = new Button("Alterar");
        btnAlterar.setOnAction(e -> control.alterar());
        grid.add(btnAlterar, 2, 4);

        Button btnRemover = new Button("Remover");
        btnRemover.setOnAction(e -> control.remover());
        grid.add(btnRemover, 3, 4);

        Button btnVoltar = new Button("Voltar ao menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnVoltar, 0, 5);

        // Estilos CSS
        grid.getStylesheets().add(getClass().getResource("/css/estiloConsulta.css").toExternalForm());
        stage.setTitle("Sistema Hospitalar: Agendamento de consultas");
        return consulta;    
    }

    // Método para exibir alertas
    public void AlertaTela(String msg) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Aviso:");
        alerta.setHeaderText("Atenção!");
        alerta.setContentText(msg); 
        alerta.show();
    }

    // Método para limpar os campos da tela
    public void limparTela() {
        this.txtAgendamentoId.setText("");
        this.txtDescricao.setText("");
        this.txtMedicoCrm.setText("");
        this.txtEspecialidadeId.setText("");
    }

    // Método para coletar os dados da tela e criar um objeto Consulta
    public Consulta obterDadosDaTela() {
        Consulta consulta = new Consulta();
        consulta.setAgendamentoId(Integer.parseInt(txtAgendamentoId.getText()));
        consulta.setDescricao(txtDescricao.getText());
        consulta.setMedicoCrm(txtMedicoCrm.getText());
        consulta.setEspecialidadeId(Integer.parseInt(txtEspecialidadeId.getText()));
        return consulta;
    }

    // Método para preencher os campos da tela com dados da consulta
    public void preencherDadosNaTela(Consulta consulta) {
        txtAgendamentoId.setText(String.valueOf(consulta.getAgendamentoId()));
        txtDescricao.setText(consulta.getDescricao());
        txtMedicoCrm.setText(consulta.getMedicoCrm());
        txtEspecialidadeId.setText(String.valueOf(consulta.getEspecialidadeId()));
    }

    public void mostrarAlerta(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarAlerta'");
    }
}
