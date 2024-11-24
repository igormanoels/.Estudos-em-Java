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
            if (!(telaCand.txtCpf.getText().isEmpty() && telaCand.txtCnpj.getText().isEmpty())) {
                Candidato c = criarCandidato();
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    INSERT INTO Candidato (numero, nome, cpf, nascimento, estado, partidoCnpj) VALUES (?, ?, ?, ?, ?, ?);
                """);
                stm.setInt(1, c.getNumero());
                stm.setString(2, c.getNome());
                stm.setString(3, c.getCpf());
                stm.setDate(4, java.sql.Date.valueOf(c.getNascimento()));
                stm.setString(5, c.getEstado());
                stm.setString(6, telaCand.txtCnpj.getText());

                int linhasAfetadas = stm.executeUpdate();
                stm.close();
                conexao.close();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi registrado com sucesso!" : "O Candidato não foi registrado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
                stm.close();
                conexao.close();
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
        telaCand.limparTela();
        dispararAlerta();
    }

    
    public void alterarCandidato() {
        try {
            if (!(telaCand.txtCpf.getText().isEmpty())) {
                Candidato c = criarCandidato();
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement("""
                        UPDATE Candidato SET 
                            numero = ?, nome = ?, nascimento = ?, estado = ?, partidoCnpj = ?
                            WHERE cpf = ?;
                        """);
                        stm.setInt(1, c.getNumero());
                        stm.setString(2, c.getNome());
                        stm.setDate(3, java.sql.Date.valueOf(c.getNascimento()));
                        stm.setString(4, c.getEstado());
                        stm.setString(5, telaCand.txtCnpj.getText());
                        stm.setString(6, c.getCpf());

                int linhasAfetadas = stm.executeUpdate();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi alterado com sucesso!" : "O Candidato não foi alterado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
                stm.close();
                conexao.close();
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
        dispararAlerta();
    }


    public void buscarCandidato() {
        int linhasAfetadas = 0;
        try {
            if (!(telaCand.txtCpf.getText().isEmpty())) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement("""
                        SELECT * FROM Candidato WHERE cpf = ?;
                        """);
                stm.setString(1, telaCand.txtCpf.getText());
                ResultSet res = stm.executeQuery();
                while(res.next()){
                    telaCand.txtNumero.setText(String.valueOf(res.getInt(1)));
                    telaCand.txtNome.setText(res.getString(2));
                    telaCand.txtCpf.setText(res.getString(3));
                    telaCand.dpAniversario.setValue(res.getDate(4).toLocalDate());
                    telaCand.txtEstado.setText(res.getString(5));
                    telaCand.txtCnpj.setText(res.getString(6));
                    linhasAfetadas+=1;
                }
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi localizado com sucesso!" : "O Candidato não foi localizado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
                stm.close();
                conexao.close();
            } else {
             this.mensagem = "Informe o número do CPF para localizar o Candidato desejado.";
             alerta.setAlertType(AlertType.INFORMATION);
            }
        } catch (Exception e) {
            this.mensagem = "Erro: " + e.getMessage();
            alerta.setAlertType(AlertType.ERROR);
        } 
        dispararAlerta();
    }


    public void removerCandidato() {
        try {
            if (!(telaCand.txtCpf.getText().isEmpty())) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    DELETE Candidato WHERE cpf = ?;        
                """);
                stm.setString(1, telaCand.txtCpf.getText());
                int linhasAfetadas = stm.executeUpdate();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi removido com sucesso!" : "O Candidato não foi removido, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
                stm.close();
                conexao.close();
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
        dispararAlerta();
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

    private void dispararAlerta() {
        alerta.setTitle("Atenção!");
        alerta.setHeaderText(null);
        alerta.setContentText(this.mensagem);
        alerta.showAndWait();
    }
    

}
