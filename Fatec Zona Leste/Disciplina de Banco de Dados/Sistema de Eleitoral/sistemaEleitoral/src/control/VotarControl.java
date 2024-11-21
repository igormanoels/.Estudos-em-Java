package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import control.bd.SqlServer;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import view.VotarView;

public class VotarControl {

    private VotarView telaVoto;
    private List<String> votaram;
    private Alert alerta = new Alert(AlertType.CONFIRMATION);
    private SqlServer sql = new SqlServer(); 

    public VotarControl(VotarView v) {
        this.votaram  = new ArrayList<>();
        this.telaVoto = v;
    }


    public void RegistrarVoto() {
        if (!(this.votaram.contains(this.telaVoto.txtCPF.getText()))) {
            this.votaram.add(telaVoto.txtCPF.getText());


            try (Connection connection = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS())) {
                System.out.println("Conexão bem-sucedida!");
            } catch (SQLException e) {
                System.err.println("Erro na conexão: " + e.getMessage());
            }


            alerta.setAlertType(AlertType.INFORMATION);
            alerta.setTitle("Sucesso!");
            alerta.setHeaderText(null);
            alerta.setContentText("Seu voto foi confirmado com sucesso!");
            alerta.showAndWait();
        } else {
            alerta.setAlertType(AlertType.ERROR);
            alerta.setTitle("Erro!");
            alerta.setHeaderText("Voto inválido, seu voto já foi registrado!");
            alerta.setContentText("Favor verificar o CPF informado.");
            alerta.showAndWait();
        }
       
        telaVoto.limparTela();
    }


    public void encerrarVotacao (Stage stage, view.Menu menu) {
        TextInputDialog logar = new TextInputDialog();
        logar.setTitle("Encerrar votação");
        logar.setHeaderText("Entre com a senha para finalizar a votação: ");
        logar.setContentText("Senha:");
        
        logar.showAndWait().ifPresent(senha -> {
            if (senha.equals("123456")) {
                alerta.setAlertType(AlertType.INFORMATION);
                alerta.setTitle("Sucesso");
                alerta.setHeaderText(null);
                alerta.setContentText("Votação encerrada com sucesso!");
                alerta.showAndWait();
                stage.setScene(menu.telaPrincipal(stage));
            } else {
                alerta.setAlertType(AlertType.ERROR);
                alerta.setTitle("Erro");
                alerta.setHeaderText(null);
                alerta.setContentText("Senha incorreta. Tente novamente.");
                alerta.showAndWait();
            }
        });

    }

    public void apurarVotos() {

    }
    
}
