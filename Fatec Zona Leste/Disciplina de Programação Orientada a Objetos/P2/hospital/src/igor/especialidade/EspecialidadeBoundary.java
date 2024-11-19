package igor.especialidade;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class EspecialidadeBoundary {

    private EspecialidadeControl control = new EspecialidadeControl();
    protected TextField txtEspecialidade = new TextField();

    public Scene cadastrarEspecialidade(Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        Scene especialidade = new Scene(grid, 800, 600);

        grid.add(new Label("Especialidade: "), 0, 0);
        grid.add(txtEspecialidade, 1, 0);
        



        Button btnGravar = new Button("Gravar");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnGravar, 0, 2);

        Button btnPesquisar = new Button("Pesquisar");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnPesquisar, 1, 2);

        Button btnAlterar = new Button("Alterar");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnAlterar, 2, 2);

        Button btnRemover = new Button("Remover");
//        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnRemover, 3, 2);


        Button btnVoltar = new Button("Voltar ao Menu");
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        grid.add(btnVoltar, 0, 3);


        stage.setTitle("Sistema Hospitalar: Cadastrar uma nova Especialidade");
        return especialidade;
    }
}
