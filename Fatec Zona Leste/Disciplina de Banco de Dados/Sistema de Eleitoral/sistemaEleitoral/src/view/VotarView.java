package view;

import java.util.Optional;

import control.VotarControl;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VotarView {

    private VotarControl votar = new VotarControl(this);
    public TextField txtCPF = new TextField();
    public TextField txtNumero = new TextField();
    
    public Scene telaVoto (Stage stage, Menu menu) {
        GridPane grid = new GridPane();
        Scene principal = new Scene(grid, 800, 600);

        grid.add(new Label("CPF DO ELEITOR: "), 0, 0);
        grid.add(new Label("NUMERO CANDIDATO: "), 0, 1);
        grid.add(txtCPF, 1, 0);
        grid.add(txtNumero, 1, 1);


        Button btnGravar = new Button("VOTAR");
        grid.add(btnGravar, 0, 2);
        btnGravar.setOnAction(e -> confirmarVoto());

        Button btnLimpar = new Button("LIMPAR TELA");
        grid.add(btnLimpar, 1, 2);
        btnLimpar.setOnAction(e -> limparTela());

        Button btnVoltar = new Button("Voltar ao Menu");
        grid.add(btnVoltar, 0, 3);
        btnVoltar.setOnAction(e -> stage.setScene(menu.telaPrincipal(stage)));

        Button btnBuscar = new Button("ENCERRAR VOTAÇÃO");
        grid.add(btnBuscar, 0, 3);
        btnBuscar.setOnAction(e -> votar.encerrarVotacao(stage, menu));


        stage.setTitle("Sistema de Votação: Votação");
        return principal;
    }

    public void limparTela() {
        this.txtCPF.setText("");
        this.txtNumero.setText("");
    }

    private void confirmarVoto() {
        Alert alerta = new Alert(AlertType.CONFIRMATION);
        alerta.setTitle("Confirmar voto.");
        alerta.setHeaderText("Eleitor atenção!");
        alerta.setContentText("Deseja realmente votar no candidato selecionado?");
        Optional<ButtonType> result = alerta.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            votar.RegistrarVoto();
        } 
    }


}
