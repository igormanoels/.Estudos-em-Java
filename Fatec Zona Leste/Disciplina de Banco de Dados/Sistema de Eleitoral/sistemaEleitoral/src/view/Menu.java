package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu {

    private CandidatoView candidato = new CandidatoView();
    private PartidoView partido = new PartidoView();
    private VotarView votar = new VotarView();
    private ApuracaoView apurar = new ApuracaoView();
    
    public Scene telaPrincipal(Stage stage) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("grid-pane");
        Scene principal = new Scene(grid, 1024, 768);
    
        
        Button btnCadPartido = new Button("Gestão de Partidos");
        grid.add(btnCadPartido, 0, 0);
        btnCadPartido.setOnAction(e -> stage.setScene(partido.telaPartido(stage, this)));
    
        Button btnCadCandidato = new Button("Gestão de Candidatos");
        grid.add(btnCadCandidato, 0, 1);
        btnCadCandidato.setOnAction(e -> stage.setScene(candidato.telaCandidato(stage, this)));
    
        Button btnVotar = new Button("Iniciar Votação");
        grid.add(btnVotar, 0, 2);
        btnVotar.setOnAction(e -> stage.setScene(votar.telaVoto(stage, this)));

        Button btnApuracao = new Button("Iniciar Apuração");
        grid.add(btnApuracao, 0, 3);
        btnApuracao.setOnAction(e -> stage.setScene(apurar.telaApuracao(stage, this)));


        principal.getStylesheets().add(getClass().getResource("/css/estiloMenu.css").toExternalForm());
        stage.setTitle("Sistema de Votação: Menu");
        return principal;
    }
    
}
