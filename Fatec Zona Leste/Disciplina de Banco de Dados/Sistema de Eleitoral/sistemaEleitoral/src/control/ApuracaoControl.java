package control;

import javafx.scene.control.Alert.AlertType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import control.bd.SqlServer;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import model.Apuracao;
import view.ApuracaoView;

public class ApuracaoControl {

    private Alert alerta = new Alert(AlertType.INFORMATION);
    private SqlServer sql = new SqlServer();
    private ApuracaoView telaApuracao;
    private String mensagem;
    private boolean resp;
    private List<Apuracao> apuracaoCandidatos;
    private List<Apuracao> buscaApuracao;



    public  ApuracaoControl(ApuracaoView ap) {
        this.telaApuracao = ap;
        this.apuracaoCandidatos = new ArrayList<>();
        this.buscaApuracao = new  ArrayList<>();
    }

    public boolean verificar () {
        TextInputDialog senha = new TextInputDialog();
        senha.setTitle("Encerrar votação");
        senha.setHeaderText("Entre com a senha para liberar a apuração: ");
        senha.setContentText("Senha:");
        
        senha.showAndWait().ifPresent(s -> {
            if (s.equals("123456")) {
                alerta.setAlertType(AlertType.INFORMATION);
                alerta.setTitle("Sucesso");
                this.mensagem = "Apuração liberada com sucesso!";
                dispararAlerta();
                this.resp = true;
            } else {
                alerta.setAlertType(AlertType.ERROR);
                alerta.setTitle("Erro");
                this.mensagem = "Senha incorreta. A apuração não foi liberada!";
                dispararAlerta();
                this.resp = false;
            }
        });
        return resp;
    }

    public void contarVotos() {
        try {
            Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
            PreparedStatement stm = conexao.prepareStatement("""
                SELECT Candidato.numero, Candidato.nome, Candidato.cpf, Candidato.nascimento, 
                       Candidato.estado, Partido.nome, COUNT(Voto.eleitorCpf) AS totalVotos
                FROM Candidato
                LEFT JOIN Voto ON Candidato.numero = Voto.candidatoNumero
                LEFT JOIN Partido ON Candidato.partidoCnpj = Partido.cnpj
                GROUP BY Candidato.numero, Candidato.nome, Candidato.cpf, Candidato.nascimento, 
                         Candidato.estado, Partido.nome;
            """);
    
            ResultSet res = stm.executeQuery();
            while (res.next()) {
                Apuracao apuracao = new Apuracao(
                    res.getInt(1),
                    res.getString(2),
                    res.getString(3),
                    res.getDate(4).toLocalDate(),
                    res.getString(5),
                    res.getString(6),
                    res.getInt(7)                        
                );
                this.apuracaoCandidatos.add(apuracao);
    
                PreparedStatement stm2 = conexao.prepareStatement("""
                    INSERT INTO Apuracao (quantidadeVotos, dataApuracao, CandidatoNumero) 
                    VALUES (?, ?, ?);
                """);
                stm2.setInt(1, apuracao.getQuantidadeVotos());
                stm2.setDate(2, java.sql.Date.valueOf(apuracao.getDataApuracao()));
                stm2.setInt(3, apuracao.getNumero());
                stm2.executeUpdate();
            }
    
            for (Apuracao a : apuracaoCandidatos) {
                telaApuracao.dadosApuracao.add(a);
            }
    
            this.mensagem = "A apuração foi concluída com sucesso!";
            alerta.setAlertType(AlertType.INFORMATION);
            dispararAlerta();
    
        } catch (Exception e) {
            alerta.setAlertType(AlertType.ERROR);
            this.mensagem = "Erro: " + e.getMessage();
            System.out.println(e);
            dispararAlerta();
        }
    }


    public void BuscarApuracao() {
        try {
            this.buscaApuracao.clear();
            Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
            PreparedStatement stm = conexao.prepareStatement("""
                SELECT Candidato.numero, Candidato.nome, Candidato.cpf, Candidato.nascimento, 
                    Candidato.estado, Partido.nome, Apuracao.quantidadeVotos, Apuracao.dataApuracao
                FROM Candidato
                INNER JOIN Partido ON Candidato.partidoCnpj = Partido.cnpj
                INNER JOIN Apuracao ON Candidato.numero = Apuracao.candidatoNumero
                WHERE Apuracao.dataApuracao = ?;
            """);
            stm.setDate(1, java.sql.Date.valueOf(telaApuracao.dataApuracao.getValue()));
            ResultSet res = stm.executeQuery();
            while (res.next()) {
                Apuracao ap = new Apuracao(
                    res.getInt(1),
                    res.getString(2),
                    res.getString(3),
                    res.getDate(4).toLocalDate(),
                    res.getString(5),
                    res.getString(6),
                    res.getInt(7),
                    res.getDate(8).toLocalDate()
                );
                this.buscaApuracao.add(ap);
            }
    
            telaApuracao.dadosApuracao.clear();
            for (Apuracao a : buscaApuracao) {
                telaApuracao.dadosApuracao.add(a);
            }
    
            this.mensagem = "A busca foi concluída com sucesso!";
            alerta.setAlertType(AlertType.INFORMATION);
            dispararAlerta();
    
        } catch (Exception e) {
            alerta.setAlertType(AlertType.ERROR);
            this.mensagem = "Erro: " + e.getMessage();
            dispararAlerta();
        }
    }


    public void BuscarApuracaoTodos() {
        try {
            this.buscaApuracao.clear();
            Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
            PreparedStatement stm = conexao.prepareStatement("""
                SELECT Candidato.numero, Candidato.nome, Candidato.cpf, Candidato.nascimento, 
                    Candidato.estado, Partido.nome, Apuracao.quantidadeVotos, Apuracao.dataApuracao
                FROM Candidato
                INNER JOIN Partido ON Candidato.partidoCnpj = Partido.cnpj
                INNER JOIN Apuracao ON Candidato.numero = Apuracao.candidatoNumero
            """);
            ResultSet res = stm.executeQuery();
            while (res.next()) {
                Apuracao ap = new Apuracao(
                    res.getInt(1),
                    res.getString(2),
                    res.getString(3),
                    res.getDate(4).toLocalDate(),
                    res.getString(5),
                    res.getString(6),
                    res.getInt(7),
                    res.getDate(8).toLocalDate()
                );
                this.buscaApuracao.add(ap);
            }
    
            telaApuracao.dadosApuracao.clear();
            for (Apuracao a : buscaApuracao) {
                telaApuracao.dadosApuracao.add(a);
            }
    
            this.mensagem = "A busca foi concluída com sucesso!";
            alerta.setAlertType(AlertType.INFORMATION);
            dispararAlerta();
    
        } catch (Exception e) {
            alerta.setAlertType(AlertType.ERROR);
            this.mensagem = "Erro: " + e.getMessage();
            dispararAlerta();
        }
    }
    

    public void LimparSistema() {
        TextInputDialog senha = new TextInputDialog();
        senha.setTitle("Limpar Sistema");
        senha.setHeaderText("Entre com a senha para liberar a limpeza: ");
        senha.setContentText("Senha:");
        
        senha.showAndWait().ifPresent(s -> {
            if (s.equals("123456")) {
                try {
                    Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS());
                    PreparedStatement stm = conexao.prepareStatement("""
                        EXEC sp_msforeachtable "ALTER TABLE ? NOCHECK CONSTRAINT ALL";
                        DELETE FROM Apuracao;
                        DELETE FROM Voto;
                        DELETE FROM Eleitor;
                        DELETE FROM Candidato;
                        DELETE FROM Partido;
                        EXEC sp_msforeachtable "ALTER TABLE ? CHECK CONSTRAINT ALL";
                        DBCC CHECKIDENT ('Apuracao', RESEED, 0);
                    """);
                    stm.executeQuery();
                } catch (Exception e) {
                    if (e.toString().contains("instrução não retornou um conjunto de resultados")) {
                        alerta.setAlertType(AlertType.INFORMATION);
                        this.mensagem = "O sistema de votação foi restaurado com sucesso!";
                    } else {
                        alerta.setAlertType(AlertType.ERROR);
                        this.mensagem = "Erro: " + e;
                    }
                    dispararAlerta();
                }
            } else {
                alerta.setAlertType(AlertType.ERROR);
                alerta.setTitle("Erro");
                this.mensagem = "Senha incorreta, tente novamente!";
                dispararAlerta();
            }
        });
    }

    private void dispararAlerta() {
        alerta.setHeaderText(null);
        alerta.setContentText(this.mensagem);
        alerta.showAndWait();
    }
    
}
