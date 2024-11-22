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

public class CondidatoControl {

    private Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    private SqlServer sql = new SqlServer();
    private CandidatoView telaCand;
    private String mensagem;
    
    public CondidatoControl (CandidatoView cv) {
        this.telaCand = cv;
    }

    public void registrarCandidato() {
        try {
            Candidato c = criarCandidato();
            if (!(c.getCpf().isEmpty())) {
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                PreparedStatement stm = conexao.prepareStatement( """
                    INSERT INTO Candidato (cnpj, nome, representante) VALUES (?, ?, ?);
                """);
                stm.setInt(1, c.getNumero());
                stm.setString(2, c.getNome());
                stm.setString(3, c.getCpf());
                stm.setDate(4, c.getNascimento());
                stm.setString(5, c.getEstado());
                int linhasAfetadas = stm.executeUpdate();
                stm.close();
                conexao.close();
                this.mensagem = (linhasAfetadas > 0) ? "O Candidato foi registrado com sucesso!" : "O Candidato não foi registrado, tente novamente!";
                alerta.setAlertType(AlertType.INFORMATION);
            } else {
                this.mensagem = "Informe o número do CPF para registrar o Candidato desejado.";
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
