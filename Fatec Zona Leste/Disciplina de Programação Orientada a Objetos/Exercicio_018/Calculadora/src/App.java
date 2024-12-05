import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
		try {
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,280,350);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Calculadora");
			
			
			// Componentes da tela
			Button btn0 = new Button("0");
			Button btn1 = new Button("1");
			Button btn2 = new Button("2");
			Button btn3 = new Button("3");
			Button btn4 = new Button("4");
			Button btn5 = new Button("5");
			Button btn6 = new Button("6");
			Button btn7 = new Button("7");
			Button btn8 = new Button("8");
			Button btn9 = new Button("9");
			Button btnPonto = new Button(".");
			Button btnSoma = new Button("+");
			Button btnSub = new Button("-");
			Button btnMult = new Button("*");
			Button btnDiv = new Button("/");
			Button btnEqual = new Button("=");
			Button btnCalc = new Button("CE");
			TextField txtTela = new TextField("");
		
			
			// Posição Coluna X Linha
			grid.add(txtTela, 0, 0);
			grid.add(btnCalc, 3, 0);
			grid.add(btn1, 0, 1);
			grid.add(btn2, 1, 1);
			grid.add(btn3, 2, 1);
			grid.add(btnSoma, 3, 1);
			grid.add(btn4, 0, 2);
			grid.add(btn5, 1, 2);
			grid.add(btn6, 2, 2);
			grid.add(btnSub, 3, 2);
			grid.add(btn7, 0, 3);
			grid.add(btn8, 1, 3);
			grid.add(btn9, 2, 3);
			grid.add(btnMult, 3, 3);
			grid.add(btnPonto, 0, 4);
			grid.add(btn0, 1, 4);
			grid.add(btnEqual, 2, 4);
			grid.add(btnDiv, 3, 4);
			
			
			// Top, Right, Bottom, Left
			GridPane.setColumnSpan(txtTela, 3);
	        GridPane.setMargin(btn0, new Insets(5, 5, 5, 5)); 
			GridPane.setMargin(btn1, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn2, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn3, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn4, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn5, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn6, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn7, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn8, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btn9, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnPonto, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnSoma, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnSub, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnMult, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnDiv, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnEqual, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(btnCalc, new Insets(5, 5, 5, 5)); 
	        GridPane.setMargin(txtTela, new Insets(5, 5, 5, 5)); 
			
	        // Cria um id para o componente
	        btnCalc.setId("limpar-Tela");
			
		} catch(Exception e) {
			e.printStackTrace();
		}

    }
}
