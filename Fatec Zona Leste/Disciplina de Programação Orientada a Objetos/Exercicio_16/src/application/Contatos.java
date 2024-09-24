package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Contatos extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane = new Pane();
			Scene scene = new Scene(pane, 520,180);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Agenda de Contatos");
						
			
			// Componentes
			Label lbId = new Label("Id: ");
			Label lbNome = new Label("Nome: ");
			Label lbTelefone = new Label("Telefone: ");
			TextField txtId = new TextField("");
			TextField txtNome = new TextField("");
			TextField txtTelefone = new TextField("");
			Button btnSalvar = new Button("Salvar");
			Button btnPesquisar= new Button("Pesquisar");
			
			
			// Posição
			lbId.relocate(30, 20);
			lbNome.relocate(30, 60);
			lbTelefone.relocate(30, 100);
			
			txtId.relocate(100, 20);
			txtNome.relocate(100, 60);
			txtTelefone.relocate(100, 100);
			
			btnSalvar.relocate(30, 140);
			btnPesquisar.relocate(100, 140);
						
			pane.getChildren().addAll(lbId, txtId, lbNome, txtNome, lbTelefone, txtTelefone, btnSalvar, btnPesquisar);
						
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
