package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CalcularIMC extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Define o Objeto do painel em forma de grid na tela
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,200,200); // Proporção, largura x altura
			
	        // Definir espaçamento entre as colunas e linhas
			grid.setVgap(10); // Espaçamento vertical
			grid.setHgap(20); // Espaçamento horizontal
			
			
			//Link para arquivo css
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene); //Define a cena da janela principal.
			primaryStage.setTitle("Calculadora de IMC"); //Define o titulo
			primaryStage.show(); //Mostra a janela 
			
			
			// Componentes da tela
			Label  tituloTxt = new Label ("Cálculadora de IMC");
			TextField imcPeso = new TextField("Informe o seu Peso: ");		
			TextField imcAltura = new TextField("Informe a sua Altura: ");
			Button calcularBtn = new Button("Calcular");
			Label  resultadoTxt = new Label ("Resultado: ");
			
			
			// Adicionando componentes, Coluna x Linha)
			grid.add(tituloTxt, 1, 0);
			grid.add(imcPeso, 1, 1);
			grid.add(imcAltura, 1, 2);
			grid.add(calcularBtn, 1, 3);
			grid.add(resultadoTxt, 1, 8);
			
			
			// Funções do botão cálcular
			calcularBtn.setOnAction(e -> {
				try {
					double peso = Double.parseDouble(imcPeso.getText());
					double altura = Double.parseDouble(imcAltura.getText());
					double imc = (peso / (Math.pow(altura, 2)));
					
					resultadoTxt.setText(String.valueOf("Resultado: " + imc));
				} catch (Exception a) {
					resultadoTxt.setText("Erro: " + a);
				}
				
			});
			
			
			
			grid.getChildren().addAll(tituloTxt, imcPeso, imcAltura, resultadoTxt); // Adciona os objetos na tela

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
