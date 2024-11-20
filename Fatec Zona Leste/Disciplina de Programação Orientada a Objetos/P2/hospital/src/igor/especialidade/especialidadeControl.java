package igor.especialidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexaoMariaDB.MariaDB;

public class EspecialidadeControl {

    private MariaDB mdb = new MariaDB();
    private EspecialidadeBoundary boundary;
    private String mensagem;

    public EspecialidadeControl(EspecialidadeBoundary boundary) {
        this.boundary = boundary;
    }

    public String inserirEspecialidade() {
        try {
            Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
            
            PreparedStatement stm = conexao.prepareStatement("""
                INSERT INTO especialidade (especialidade) 
                VALUES (?)
             """);
            String esp = boundary.txtEspecialidade.getText().trim();
            stm.setString(1, esp);

            int linhasAfetadas = stm.executeUpdate();
            mensagem = (linhasAfetadas > 0) ? "Especialidade: " + esp + ", gravada com sucesso!" : "Falha ao gravar a especialidade.";

        } catch (Exception e) {
            mensagem = "Erro: " + e.getMessage();
        }

        boundary.AlertaTela(mensagem);
        boundary.limparTela();
        return mensagem;
    }

    public String buscarEspecialidade() {
        try {
            int linhasAfetadas = 0;
            Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
            String sql, op;
            if (boundary.txtId.getText().isEmpty()) {
                System.out.println("Está vázio");
                sql = """
                    SELECT * FROM especialidade WHERE especialidade = ?;
                 """;
                op = boundary.txtEspecialidade.getText().trim();
            } else {
                sql = """
                    SELECT * FROM especialidade WHERE id = ?;
                 """;
                op = boundary.txtId.getText().trim();
            }
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, op);
            ResultSet res = stm.executeQuery();
            while (res.next()) {
                boundary.txtId.setText(String.valueOf(res.getInt("id")));
                boundary.txtEspecialidade.setText(res.getString("especialidade"));
                linhasAfetadas+=1;
            }
            mensagem = (linhasAfetadas > 0) ? "Especialidade foi localizada com sucesso!" : "Especialidade não encontrada.";

        } catch (Exception e) {
            mensagem = "Erro: " + e.getMessage();
        }

        boundary.AlertaTela(mensagem);
        return mensagem;
    }

//     public void alterarEspecialidade() {
// // CHAMAR A pegarEspecialidade PARA ALTERAR
//     }

//     public void removerEspecialidade() {
// // CHAMAR A pegarEspecialidade PARA REMOVER
//     }
}
