import java.util.ArrayList;
import java.util.List;

public class ContatoControll {

    private List<Contato> contatos;

    public ContatoControll () {
        this.contatos = new ArrayList<>();
    }
    
    public void gravar(Contato c) {
        contatos.add(c);
    }

    public Contato pesquisar(Contato c) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(c.getNome()) 
                || contato.getTelefone().equalsIgnoreCase(c.getTelefone())
                || contato.getEmail().equalsIgnoreCase(c.getEmail())
                ) return contato;
            }
        return null;
    }
}
