import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/* Instruções
 * Crie uma aplicação para mostrar uma agenda de contatos, semelhante a esta em anexo. 
 * Neste exercício preocupe-se apenas em criar a tela não se preocupe com as funcionalidades dos botões. 
 * Utilize alguns Paineis especiais como BorderPane, FlowPane, GridPane ou outro que desejar para tornar a tela responsiva 
 */

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
		try {
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,480,180);

			grid.setVgap(10);
			grid.setHgap(5);
			
			
			// Componentes
			Label lbId = new Label(" Id: ");
			Label lbNome = new Label(" Nome: ");
			Label lbTelefone = new Label(" Telefone: ");
			TextField txtId = new TextField("");
			TextField txtNome = new TextField("");
			TextField txtTelefone = new TextField("");
			Button btnSalvar = new Button("Salvar");
			Button btnPesquisar= new Button("Pesquisar");
			
			
			// Posição
			grid.add(lbId, 1, 0);
			grid.add(lbNome, 1, 1);
			grid.add(lbTelefone, 1, 2);
			grid.add(txtId, 2, 0);
			grid.add(txtNome, 2, 1);
			grid.add(txtTelefone, 2, 2);
			grid.add(btnSalvar, 1, 3);
			grid.add(btnPesquisar, 2, 3);
			

            primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Agenda de Contatos");

		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}
