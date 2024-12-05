package especialidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexaoMariaDB.MariaDB;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EspecialidadeDAOImpl implements EspecialidadeDAO {

    private MariaDB mdb = new MariaDB();
    private String mensagem;

    @Override
    public String gravar(Especialidade e) {
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement("""
                 INSERT INTO especialidade (especialidade) VALUES (?);
             """)) {

            if (e != null && e.getEspecialidade() != null && !e.getEspecialidade().isEmpty()) {
                stm.setString(1, e.getEspecialidade());

                int linhasAfetadas = stm.executeUpdate();
                mensagem = (linhasAfetadas > 0)
                        ? "Especialidade: " + e.getEspecialidade() + ", gravada com sucesso!"
                        : "Falha ao gravar a especialidade.";
            } else {
                mensagem = "Especialidade inválida. Informe um nome.";
            }
        } catch (Exception ex) {
            mensagem = "Erro ao gravar especialidade: " + ex.getMessage();
        }
        return mensagem;
    }

    @Override
    public Especialidade atualizar(Especialidade e) {
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement("""
                 UPDATE especialidade SET especialidade = ? WHERE id = ?;
             """)) {

            if (e != null) {
                stm.setString(1, e.getEspecialidade());
                stm.setInt(2, e.getId());

                int linhasAfetadas = stm.executeUpdate();
                mensagem = (linhasAfetadas > 0)
                        ? "Especialidade alterada com sucesso!"
                        : "Especialidade não encontrada para alteração.";
            } else {
                mensagem = "Dados inválidos para atualização.";
            }
        } catch (Exception ex) {
            mensagem = "Erro ao atualizar especialidade: " + ex.getMessage();
        }
        return e;
    }

    @Override
    public String remover(Especialidade e) {
        if (e == null) {
            return "Especialidade inválida para remoção.";
        }
    
        String mensagem;
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement("""
                 DELETE FROM especialidade WHERE id = ?;
             """)) {
    
            stm.setInt(1, e.getId());
            int linhasAfetadas = stm.executeUpdate();
    
            mensagem = (linhasAfetadas > 0) 
                ? "Especialidade removida com sucesso!"
                : "Especialidade não encontrada para remoção.";
        } catch (Exception err) {
            mensagem = "Erro ao remover especialidade: " + err.getMessage();
        }
        return mensagem;
    }
    


    @Override
    public Especialidade procurar(Especialidade e) {
        Especialidade encontrada = new Especialidade(); // Objeto para armazenar o resultado
        String mensagem;
    
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement("""
                 SELECT * FROM especialidade WHERE id = ? OR especialidade = ?;
             """)) {
    
            if (e != null) {
                stm.setObject(1, e.getId());
                stm.setString(2, e.getEspecialidade());
    
                ResultSet res = stm.executeQuery();
                if (res.next()) {
                    encontrada.setId(res.getInt("id"));
                    encontrada.setEspecialidade(res.getString("especialidade"));
                    mensagem = "Especialidade encontrada com sucesso.";
                } else {
                    mensagem = "Especialidade não encontrada.";
                }
            } else {
                mensagem = "Dados inválidos para busca.";
            }
        } catch (Exception ex) {
            mensagem = "Erro ao procurar especialidade: " + ex.getMessage();
        }
    
        AlertaTela(mensagem);
        return encontrada; 
    }
    

    
    public void AlertaTela(String msg) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Aviso:");
        alerta.setHeaderText("Atenção!");
        alerta.setContentText(msg);
        alerta.show();
    }
}
