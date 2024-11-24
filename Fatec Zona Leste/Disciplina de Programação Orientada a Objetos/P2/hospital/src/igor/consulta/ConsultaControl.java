package igor.consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import conexaoMariaDB.MariaDB;

public class ConsultaControl {

    private MariaDB mdb = new MariaDB();
    private ConsultaBoundary boundary;e
    private String mensagem;

    public ConsultaControl(ConsultaBoundary boundary) {
        this.boundary = boundary;
    }

    public void inserirEspecialidade() {
        try {
            if(boundary.txtCpf.getText().isEmpty()) {
                Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
                
                PreparedStatement stm = conexao.prepareStatement("""
                    INSERT INTO especialidade (especialidade) 
                    VALUES (?)
                """);
                String esp = boundary.txtEspecialidade.getText().trim();
                stm.setString(1, esp);

                int linhasAfetadas = stm.executeUpdate();
                mensagem = (linhasAfetadas > 0) ? "Especialidade: " + esp + ", gravada com sucesso!" : "Falha ao gravar a especialidade.";
            } else {
                mensagem = "Informe apenas o nome da especialidade";
            }
        } catch (Exception e) {
            mensagem = "Erro: " + e.getMessage();
        }

        boundary.AlertaTela(mensagem);
        boundary.limparTela();
    }

    // public void buscarEspecialidade() {
    //     try {
    //         int linhasAfetadas = 0;
    //         Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
    //         String sql, op;
    //         if (boundary.txtId.getText().isEmpty()) {
    //             System.out.println("Está vázio");
    //             sql = """
    //                 SELECT * FROM especialidade WHERE especialidade = ?;
    //              """;
    //             op = boundary.txtEspecialidade.getText().trim();
    //         } else {
    //             sql = """
    //                 SELECT * FROM especialidade WHERE id = ?;
    //              """;
    //             op = boundary.txtId.getText().trim();
    //         }
    //         PreparedStatement stm = conexao.prepareStatement(sql);
    //         stm.setString(1, op);
    //         ResultSet res = stm.executeQuery();
    //         while (res.next()) {
    //             boundary.txtId.setText(String.valueOf(res.getInt("id")));
    //             boundary.txtEspecialidade.setText(res.getString("especialidade"));
    //             linhasAfetadas+=1;
    //         }
    //         mensagem = (linhasAfetadas > 0) ? "Especialidade foi localizada com sucesso!" : "Especialidade não encontrada.";

    //     } catch (Exception e) {
    //         mensagem = "Erro: " + e.getMessage();
    //     }

    //     boundary.AlertaTela(mensagem);
    // }

    // public void alterarEspecialidade() {
    //     try {
    //         Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
    //         String sql;
            
    //         if (boundary.txtId.getText().isEmpty() && boundary.txtEspecialidade.getText().isEmpty()) {    
    //             mensagem = "Informe o id e o nome da especialidade para atualizar";
    //         } else {
    //             sql = """
    //                 UPDATE especialidade SET especialidade=? 
    //                 WHERE id=?
    //             """;
    //             PreparedStatement stm = conexao.prepareStatement(sql);
    //             stm.setString(1, boundary.txtEspecialidade.getText().trim());
    //             stm.setString(2, boundary.txtId.getText().trim());
    //             int linhasAfetadas = stm.executeUpdate();
    //             mensagem = (linhasAfetadas > 0) ? "Especialidade alterada com sucesso!" : "Falha ao alterar a especialidade.";
    //         }
    //     } catch (Exception e) {
    //         mensagem = "Erro: " + e.getMessage();
    //     }
    //     boundary.AlertaTela(mensagem);
    //     boundary.limparTela();
    // }

    // public void removerEspecialidade() {
    //     try {
    //         Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
    //         String sql, op;
            
    //         if (boundary.txtId.getText().isEmpty()) {    
    //             sql = """
    //                 DELETE FROM especialidade WHERE especialidade = ?
    //             """;
    //             op = boundary.txtEspecialidade.getText().trim();
                
    //         } else {
    //             sql = """
    //                 DELETE FROM especialidade WHERE id = ?
    //             """;
    //             op = boundary.txtId.getText().trim();
    //         }

    //         PreparedStatement stm = conexao.prepareStatement(sql);
    //         stm.setString(1, op);
    //         int linhasAfetadas = stm.executeUpdate();
    //         mensagem = (linhasAfetadas > 0) ? "Especialidade removida com sucesso!" : "Falha ao remover a especialidade.";

    //     } catch (Exception e) {
    //         mensagem = "Erro: " + e.getMessage();
    //     }
    //     boundary.AlertaTela(mensagem);
    //     boundary.limparTela();
    // }
}
