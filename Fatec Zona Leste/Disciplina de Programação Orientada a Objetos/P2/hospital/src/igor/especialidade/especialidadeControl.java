package igor.especialidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import conexaoMariaDB.MariaDB;

public class EspecialidadeControl {
    
    private MariaDB mdb = new MariaDB();
    private Connection con;
    private EspecialidadeBoundary bd = new EspecialidadeBoundary();

    public void inserirEspecialidade() {
            String sql = """
                INSERT INTO especialidades (especialidade) 
                VALUES (?)
                    """;
            conectarMariaDB();
       try{     
            PreparedStatement stm = this.con.prepareStatement(sql);
            stm.setString(0, pegarEspecialidade());
            stm.executeQuery();
            con.close();
       } catch (Exception e) {}
    }

    public void buscarEspecialidade() {
// CHAMAR A pegarEspecialidade PARA BUSCAR
    }

    public void alterarEspecialidade() {
// CHAMAR A pegarEspecialidade PARA ALTERAR
    }

    public void removerEspecialidade() {
// CHAMAR A pegarEspecialidade PARA REMOVER
    }

    private void conectarMariaDB() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            this.con = DriverManager.getConnection(this.mdb.getURL(), this.mdb.getUSER(), this.mdb.getPASS());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String pegarEspecialidade() {
        String esp = this.bd.txtEspecialidade.getText();
        return esp;
    }

    private void inserirEspecialidade(String esp) {
        this.bd.txtEspecialidade.setText(esp);
    }


    
}
