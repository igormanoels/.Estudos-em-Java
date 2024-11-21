package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CandidatoView {

    protected TextField txtNome = new TextField();
    protected TextField txtNascimento = new TextField();
    protected TextField txtEstado = new TextField();
    protected TextField txtNumero = new TextField();

    public Scene telaCandidato (Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        Scene principal = new Scene(grid, 800, 600);

        grid.add(new Label("NOME: "), 0, 0);
        grid.add(new Label("NASCIMENTO: "), 0, 1);
        grid.add(new Label("ESTADO: "), 0, 2);
        grid.add(new Label("NUMERO PARA VOTO: "), 0, 3);
        grid.add(txtNome, 1, 0);
        grid.add(txtNascimento, 1, 1);
        grid.add(txtEstado, 1, 2);
        grid.add(txtNumero, 1, 3);


        Button btnGravar = new Button("Gravar");
        grid.add(btnGravar, 0, 4);
        //btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));

        Button btnAlterar = new Button("Alterar");
        grid.add(btnAlterar, 1, 4);
        //btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));

        Button btnBuscar = new Button("Buscar");
        grid.add(btnBuscar, 2, 4);
        //btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));

        Button btnRemover = new Button("Remover");
        grid.add(btnRemover, 3, 4);
        //btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));


        Button btnVoltar = new Button("Voltar ao Menu");
        grid.add(btnVoltar, 0, 5);
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

        Button btnLimpar = new Button("Limpar Tela");
        grid.add(btnLimpar, 1, 5);
        btnLimpar.setOnAction(e -> limparTela());


        stage.setTitle("Sistema de Votação: Candidato");
        return principal;
    }

    public void limparTela() {
        this.txtNome.setText("");
        this.txtNascimento.setText("");
        this.txtEstado.setText("");
        this.txtNumero.setText("");
    }
    
}
