package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import control.bd.SqlServer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Candidato;
import view.CandidatoView;

public class CandidatoControl {

    private Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    private SqlServer sql = new SqlServer();
    private CandidatoView telaCand;
    private String mensagem;
    
    public CandidatoControl (CandidatoView cv) {
        this.telaCand = cv;
    }

    public void registrarCandidato() {
        try {
            Candidato c = criarCandidato();
            if (!(c.getCpf().isEmpty()) && telaCand.txtCnpj.getText().isEmpty()) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    INSERT INTO Candidato (numero, nome, cpf, nacimento, estado, partidoCnpj) VALUES (?, ?, ?, ?, ?, ?);
                """);
                stm.setInt(1, c.getNumero());
                stm.setString(2, c.getNome());
                stm.setString(3, c.getCpf());
                stm.setDate(4, c.getNascimento());
                stm.setString(5, c.getEstado());
                stm.setString(6, telaCand.txtCnpj.getText());

                int linhasAfetadas = stm.executeUpdate();
                stm.close();
                conexao.close();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi registrado com sucesso!" : "O Candidato não foi registrado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
                this.mensagem = "Verifique o número do CPF/CNPJ, do Candidado/Partido foram informados.";
                alerta.setAlertType(AlertType.ERROR);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            this.mensagem = "O Candidato já está registrado.";
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

    
    public void alterarCandidato() {
        try {
            if (!(telaCand.txtCpf.getText().isEmpty())) {
                Candidato c = criarCandidato();
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement("""
                        UPDATE Candidato SET nome = ?, representante = ? WHERE cnpj = ?;
                        """);
                        stm.setInt(1, c.getNumero());
                        stm.setString(2, c.getNome());
                        stm.setString(3, c.getCpf());
                        stm.setDate(4, c.getNascimento());
                        stm.setString(5, c.getEstado());
                int linhasAfetadas = stm.executeUpdate();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi alterado com sucesso!" : "O Candidato não foi alterado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
             this.mensagem = "Informe o número do CPF para alterar o Candidato desejado.";
             alerta.setAlertType(AlertType.INFORMATION);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            this.mensagem = "O Candidato já está vinculado a Candidatos/ Eleitores, e não pode ser removido.";
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


    public void buscarCandidato() {
        int linhasAfetadas = 0;
        try {
            if (!(telaCand.txtCnpj.getText().isEmpty())) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement("""
                        SELECT * FROM Candidato WHERE cnpj = ?;
                        """);
                stm.setString(1, telaCand.txtCnpj.getText());
                ResultSet res = stm.executeQuery();
                while(res.next()){
                    telaCand.txtCnpj.setText(res.getString(1));
                    telaCand.txtNome.setText(res.getString(2));
                    telaCand.txtRep.setText(res.getString(3));
                    linhasAfetadas+=1;
                }
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi localizado com sucesso!" : "O Candidato não foi localizado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
             this.mensagem = "Informe o número do CNPJ para localizar o Candidato desejado.";
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


    public void removerCandidato() {
        try {
            if (!(telaCand.txtCnpj.getText().isEmpty())) {
                this.cnpj = telaCand.txtCnpj.getText();
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    DELETE Candidato WHERE cnpj = ?;        
                """);
                stm.setString(1, cnpj);
                int linhasAfetadas = stm.executeUpdate();
                stm.close();
                conexao.close();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi removido com sucesso!" : "O Candidato não foi removido, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
                this.mensagem = "Informe o número do CNPJ para remover o Candidato desejado.";
                alerta.setAlertType(AlertType.ERROR);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            this.mensagem = "O Candidato já está vinculado a Candidatos/ Eleitores, e não pode ser removido.";
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

    private Candidato criarCandidato(){
        Candidato c = new Candidato (
            telaCand.txtNumero.getText(),
            telaCand.txtNome.getText(),
            telaCand.txtCpf.getText(),
            telaCand.dpAniversario.getValue(),
            telaCand.txtEstado.getText()
        );
        return c;
    }
    

}
