package view;

import control.PartidoControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PartidoView {

    private PartidoControl control = new PartidoControl(this);
    public TextField txtCnpj = new TextField();
    public TextField txtNome = new TextField();
    public TextField txtRep = new TextField();

    public Scene telaPartido (Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("grid-pane");
        Scene principal = new Scene(grid, 800, 600);


        grid.add(new Label("CNPJ: "), 0, 0);
        grid.add(new Label("NOME: "), 0, 1);
        grid.add(new Label("REPRESENTANTE: "), 0, 2);
        grid.add(txtCnpj, 1, 0);
        grid.add(txtNome, 1, 1);
        grid.add(txtRep, 1, 2);


        Button btnGravar = new Button("Gravar");
        grid.add(btnGravar, 0, 4);
        btnGravar.setOnAction(e -> control.registrarPartido());

        Button btnAlterar = new Button("Alterar");
        grid.add(btnAlterar, 1, 4);
        //btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));

        Button btnBuscar = new Button("Buscar");
        grid.add(btnBuscar, 2, 4);
        //btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));

        Button btnRemover = new Button("Remover");
        grid.add(btnRemover, 3, 4);
        btnRemover.setOnAction(e -> control.removerPartido());


        Button btnVoltar = new Button("Voltar ao Menu");
        grid.add(btnVoltar, 0, 5);
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

        Button btnLimpar = new Button("Limpar Tela");
        grid.add(btnLimpar, 1, 5);
        btnLimpar.setOnAction(e -> limparTela());

        principal.getStylesheets().add(getClass().getResource("/css/estiloPartido.css").toExternalForm());
        stage.setTitle("Sistema de Votação: Partido");
        return principal;
    }

    public void limparTela() {
        this.txtCnpj.setText("");
        this.txtNome.setText("");
        this.txtRep.setText("");
    }

}
