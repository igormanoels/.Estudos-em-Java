package control;

import java.sql.Connection;
import java.sql.DriverManager;

import control.bd.SqlServer;
import model.Partido;
import view.PartidoView;

public class PartidoControl {

    private SqlServer sql = new SqlServer();
    private PartidoView telaPT;
    private String cnpj, mensagem;
    
    public PartidoControl (PartidoView pv) {
        this.telaPT = pv;
    }

    public void registrarPartido() {
        Partido p = new Partido(telaPT.txtCnpj.getText(), telaPT.txtNome.getText(), telaPT.txtRep.getText());
    }

    public void alterarPartido() {
        

    }

    public void buscarPartido() {
        try {
            this.cnpj = telaPT.txtCnpj.getText();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void removerPartido() {
        try {
            if (!(telaPT.txtCnpj.getText().isEmpty())) {
                this.cnpj = telaPT.txtCnpj.getText();
                Connection conexao = DriverManager.getConnection(sql.getURL(), sql.getUSER(), sql.getPASS())
            }
        } catch (Exception e) {
            this.mensagem = "Erro: " + e;
        }
    } 
    

}
