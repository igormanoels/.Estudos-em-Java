import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(telaPrincipal(stage));
        stage.show();
    }


    public Scene telaPrincipal(Stage stage){
        GridPane grid = new GridPane();
        Scene principal = new Scene(grid, 800, 600);

        Button btnCadastrarAluno = new Button("Cadastrar Aluno");
        Button btnCadastrarProfessor = new Button("Cadastrar Professor");

        btnCadastrarAluno.setOnAction(e -> stage.setScene(cadastrarAluno(stage)));
        btnCadastrarProfessor.setOnAction(e -> stage.setScene(cadastrarProfessor(stage)));

        grid.add(btnCadastrarAluno, 0, 0);
        grid.add(btnCadastrarProfessor, 1, 0);

        stage.setTitle("Menu Principal");
        return principal;    
    }


    public Scene cadastrarAluno(Stage stage){
        GridPane grid = new GridPane();
        Scene cadastrarAluno = new Scene(grid, 800, 600);

        Button voltar = new Button("voltar");
        voltar.setOnAction(e -> stage.setScene(telaPrincipal(stage)));
        grid.add(voltar, 0, 0);

        
        stage.setTitle("Cadastro Aluno");
        return cadastrarAluno;
    }


    public Scene cadastrarProfessor(Stage stage){
        GridPane grid = new GridPane();
        Scene cadastrarProfessor = new Scene(grid, 800, 600);

        Button voltar = new Button("voltar");
        voltar.setOnAction(e -> stage.setScene(telaPrincipal(stage)));
        grid.add(voltar, 0, 0);


        stage.setTitle("Cadastro Professor");
        return cadastrarProfessor;
    }
}
