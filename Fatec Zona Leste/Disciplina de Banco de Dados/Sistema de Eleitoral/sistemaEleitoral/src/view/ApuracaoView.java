package view;

import control.ApuracaoControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ApuracaoView {

    private ApuracaoControl control = new  ApuracaoControl();

    public Scene telaApuracao (Stage stage, Menu menu) {
       
        if (control.verificar()) {
            GridPane grid = new GridPane();
            grid.getStyleClass().add("grid-pane");
            Scene principal = new Scene(grid, 800, 600);
            Button btnVoltar = new Button("Voltar ao Menu");
            grid.add(btnVoltar, 0, 7);
            btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));


            principal.getStylesheets().add(getClass().getResource("/css/estiloCandidato.css").toExternalForm());
            stage.setTitle("Sistema de Votação: Apuração");
            return principal;
        } else {
            return menu.telaPrincipal(stage);
        }
    }
    
}
