package view;

import control.CandidatoControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CandidatoView {

    private CandidatoControl control = new CandidatoControl(this);

    public TextField txtNumero = new TextField();
    public TextField txtNome = new TextField();
    public TextField txtCpf = new TextField();
    public DatePicker dpAniversario = new DatePicker();
    public TextField txtEstado = new TextField();
    public TextField txtCnpj = new TextField();
    

    public Scene telaCandidato (Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("grid-pane");
        Scene principal = new Scene(grid, 1024, 768);

        grid.add(new Label("NUMERO PARA VOTO: "), 0, 0);
        grid.add(new Label("NOME: "), 0, 1);
        grid.add(new Label("CPF: "), 0, 2);
        grid.add(new Label("NASCIMENTO: "), 0, 3);
        grid.add(new Label("ESTADO: "), 0, 4);
        grid.add(new Label("CNPJ PARTIDO: "), 0, 5);

        grid.add(txtNumero, 1, 0);
        grid.add(txtNome, 1, 1);
        grid.add(txtCpf, 1, 2);
        grid.add(dpAniversario, 1, 3);
        grid.add(txtEstado, 1, 4);
        grid.add(txtCnpj, 1, 5);

        GridPane.setColumnSpan(txtNome, 3);
        GridPane.setColumnSpan(txtCpf, 3);
        GridPane.setColumnSpan(dpAniversario, 3);
        GridPane.setColumnSpan(txtEstado, 3);
        GridPane.setColumnSpan(txtNumero, 3);
        GridPane.setColumnSpan(txtCnpj, 3);
        
        
        Button btnGravar = new Button("Gravar");
        grid.add(btnGravar, 0, 6);
        btnGravar.setOnAction(e -> control.registrarCandidato());

        Button btnAlterar = new Button("Alterar");
        grid.add(btnAlterar, 1, 6);
        btnAlterar.setOnAction(e -> control.alterarCandidato());

        Button btnBuscar = new Button("Buscar");
        grid.add(btnBuscar, 2, 6);
        btnBuscar.setOnAction(e -> control.buscarCandidato());

        Button btnRemover = new Button("Remover");
        grid.add(btnRemover, 3, 6);
        btnRemover.setOnAction(e -> control.removerCandidato());


        Button btnVoltar = new Button("Voltar ao Menu");
        grid.add(btnVoltar, 0, 7);
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

        Button btnLimpar = new Button("Limpar Tela");
        grid.add(btnLimpar, 1, 7);
        btnLimpar.setOnAction(e -> limparTela());


        principal.getStylesheets().add(getClass().getResource("/css/estiloCandidato.css").toExternalForm());
        stage.setTitle("Sistema de Votação: Candidato");
        return principal;
    }

    public void limparTela() {
        this.txtNumero.setText("");
        this.txtNome.setText("");
        this.txtCpf.setText("");
        this.dpAniversario.setValue(null);
        this.txtEstado.setText("");
        this.txtCnpj.setText("");
    }
    
}
