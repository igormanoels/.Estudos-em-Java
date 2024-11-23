package control;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

public class ApuracaoControl {

    private Alert alerta = new Alert(AlertType.INFORMATION);
    private boolean resp;

    public boolean verificar () {
        TextInputDialog senha = new TextInputDialog();
        senha.setTitle("Encerrar votação");
        senha.setHeaderText("Entre com a senha para liberar a apuração: ");
        senha.setContentText("Senha:");
        
        senha.showAndWait().ifPresent(s -> {
            if (s.equals("123456")) {
                alerta.setAlertType(AlertType.INFORMATION);
                alerta.setTitle("Sucesso");
                alerta.setHeaderText(null);
                alerta.setContentText("Apuração liberada com sucesso!");
                alerta.showAndWait();
                this.resp = true;
            } else {
                alerta.setAlertType(AlertType.ERROR);
                alerta.setTitle("Erro");
                alerta.setHeaderText(null);
                alerta.setContentText("Senha incorreta. A apuração não foi liberada!");
                alerta.showAndWait();
                this.resp = false;
            }
        });
        return resp;
    }
    
}
