package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import control.bd.SqlServer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Partido;
import view.PartidoView;

public class PartidoControl {

    private Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    private SqlServer sql = new SqlServer();
    private PartidoView telaPT;
    private String cnpj, mensagem;
    
    public PartidoControl (PartidoView pv) {
        this.telaPT = pv;
    }

    public void registrarPartido() {
        try {
            Partido p = new Partido(telaPT.txtCnpj.getText(), telaPT.txtNome.getText(), telaPT.txtRep.getText());
            if (!(p.getCnpj().isEmpty())) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    INSERT INTO Partido (cnpj, nome, representante) VALUES (?, ?, ?);
                """);
                stm.setString(1, p.getCnpj());
                stm.setString(2, p.getNome());
                stm.setString(3, p.getRepresentante());
                int linhasAfetadas = stm.executeUpdate();
                stm.close();
                conexao.close();
                this.mensagem = (linhasAfetadas > 0) ? "O partido foi registrado com sucesso!" : "O partido não foi registrado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
                this.mensagem = "Informe o número do CNPJ para registrar o partido desejado.";
                alerta.setAlertType(AlertType.ERROR);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            this.mensagem = "O partido já está registrado.";
            alerta.setAlertType(AlertType.ERROR);
        } catch (Exception e) {
            this.mensagem = "Erro: " + e.getMessage();
            alerta.setAlertType(AlertType.ERROR);
        }
        
        alerta.setTitle("Atenção!");
        alerta.setHeaderText(null);
        alerta.setContentText(this.mensagem);
        alerta.showAndWait();
    }

    
    public void alterarPartido() {
        try {
            if (!(telaPT.txtCnpj.getText().isEmpty())) {
                Partido p = new Partido(telaPT.txtCnpj.getText(), telaPT.txtNome.getText(), telaPT.txtRep.getText());
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement("""
                        UPDATE Partido SET nome = ?, representante = ? WHERE cnpj = ?;
                        """);
                stm.setString(1, p.getNome());
                stm.setString(2, p.getRepresentante());
                stm.setString(3, p.getCnpj());
                int linhasAfetadas = stm.executeUpdate();
                this.mensagem = (linhasAfetadas > 0) ? "O partido foi alterado com sucesso!" : "O partido não foi alterado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
             this.mensagem = "Informe o número do CNPJ para alterar o partido desejado.";
             alerta.setAlertType(AlertType.INFORMATION);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            this.mensagem = "O partido já está vinculado a Candidatos/ Eleitores, e não pode ser removido.";
            alerta.setAlertType(AlertType.ERROR);
        } catch (Exception e) {
            this.mensagem = "Erro: " + e.getMessage();
            alerta.setAlertType(AlertType.ERROR);
        } 
        alerta.setTitle("Atenção!");
        alerta.setHeaderText(null);
        alerta.setContentText(this.mensagem);
        alerta.showAndWait();
    }


    public void buscarPartido() {
        int linhasAfetadas = 0;
        try {
            if (!(telaPT.txtCnpj.getText().isEmpty())) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement("""
                        SELECT * FROM Partido WHERE cnpj = ?;
                        """);
                stm.setString(1, telaPT.txtCnpj.getText());
                ResultSet res = stm.executeQuery();
                while(res.next()){
                    telaPT.txtCnpj.setText(res.getString(1));
                    telaPT.txtNome.setText(res.getString(2));
                    telaPT.txtRep.setText(res.getString(3));
                    linhasAfetadas+=1;
                }
                this.mensagem = (linhasAfetadas > 0) ? "O partido foi localizado com sucesso!" : "O partido não foi localizado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
             this.mensagem = "Informe o número do CNPJ para localizar o partido desejado.";
             alerta.setAlertType(AlertType.INFORMATION);
            }
        } catch (Exception e) {
            this.mensagem = "Erro: " + e.getMessage();
            alerta.setAlertType(AlertType.ERROR);
        } 
        alerta.setTitle("Atenção!");
        alerta.setHeaderText(null);
        alerta.setContentText(this.mensagem);
        alerta.showAndWait();
    }


    public void removerPartido() {
        try {
            if (!(telaPT.txtCnpj.getText().isEmpty())) {
                this.cnpj = telaPT.txtCnpj.getText();
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    DELETE Partido WHERE cnpj = ?;        
                """);
                stm.setString(1, cnpj);
                int linhasAfetadas = stm.executeUpdate();
                stm.close();
                conexao.close();
                this.mensagem = (linhasAfetadas > 0) ? "O partido foi removido com sucesso!" : "O partido não foi removido, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
                this.mensagem = "Informe o número do CNPJ para remover o partido desejado.";
                alerta.setAlertType(AlertType.ERROR);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            this.mensagem = "O partido já está vinculado a Candidatos/ Eleitores, e não pode ser removido.";
            alerta.setAlertType(AlertType.ERROR);
        } catch (Exception e) {
            this.mensagem = "Erro: " + e.getMessage();
            alerta.setAlertType(AlertType.ERROR);
        } 
        alerta.setTitle("Atenção!");
        alerta.setHeaderText(null);
        alerta.setContentText(this.mensagem);
        alerta.showAndWait();
    } 
    

}
