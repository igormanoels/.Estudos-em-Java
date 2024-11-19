package igor.consulta;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tela.Menu;

public class ConsultaBoundary {

    public Scene cadastrarConsulta(Stage stage, Menu menu){
        GridPane grid = new GridPane();
        Scene consulta = new Scene(grid, 800, 600);

        Button btnVoltar = new Button("Voltar ao menu");

        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));
        // btnCadMedico.setOnAction(e -> stage.setScene(cadastrarProfessor(stage)));

        grid.add(btnVoltar, 0, 9);

        stage.setTitle("Sistema Hospitalar: Agendamento de Consulta");
        return consulta;    
    }
    
}
