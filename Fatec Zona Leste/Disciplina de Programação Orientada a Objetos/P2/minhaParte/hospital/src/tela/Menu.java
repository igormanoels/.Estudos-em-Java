package tela;
import consulta.ConsultaBoundary;
import especialidade.EspecialidadeBoundary;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;    
import javafx.stage.Stage;


public class Menu {

    private ConsultaBoundary csBoundary = new ConsultaBoundary();
    private EspecialidadeBoundary espBoundary = new EspecialidadeBoundary();

    public Scene telaPrincipal(Stage stage) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("grid-pane");
        Scene principal = new Scene(grid, 1000, 600);


        Button btnCadEspecialidade = new Button("Cadastrar nova Especialidade");
        grid.add(btnCadEspecialidade, 0, 2);
        btnCadEspecialidade.setOnAction(e -> stage.setScene(espBoundary.cadastrarEspecialidade(stage, this)));
        

        Button btnAgendarConsulta = new Button("Agendar nova Consulta");
        grid.add(btnAgendarConsulta, 0, 6);
        btnAgendarConsulta.setOnAction(e -> stage.setScene(csBoundary.telaConsulta(stage, this)));


        principal.getStylesheets().add(getClass().getResource("/css/estiloMenu.css").toExternalForm());
        stage.setTitle("Sistema Hospitalar: Menu");
        return principal;
    }
}
