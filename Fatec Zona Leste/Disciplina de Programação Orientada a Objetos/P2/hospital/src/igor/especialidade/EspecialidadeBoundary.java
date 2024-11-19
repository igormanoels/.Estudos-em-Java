package igor.especialidade;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class EspecialidadeBoundary {

    public Scene cadastrarEspecialidade(Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        Scene especialidade = new Scene(grid, 800, 600);

        Button btnVoltar = new Button("Voltar ao Menu");

        // Volta para a tela principal do menu
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

        grid.add(btnVoltar, 0, 0);

        stage.setTitle("Sistema Hospitalar: Cadastrar uma nova Especialidade");
        return especialidade;
    }
}
