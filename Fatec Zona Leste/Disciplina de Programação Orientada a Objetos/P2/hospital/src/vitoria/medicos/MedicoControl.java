package vitoria.medicos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MedicoControl {

    private ObservableList<Medico> lista = FXCollections.observableArrayList();
    private IntegerProperty id = new SimpleIntegerProperty(0);
    private StringProperty crm = new SimpleStringProperty("");
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty telefone = new SimpleStringProperty("");
    private StringProperty email = new SimpleStringProperty("");
    private StringProperty especialidade = new SimpleStringProperty("");

    private MedicoDAO medicoDAO;

    private int contador = 0;

    public MedicoControl() throws MedicoException {
        medicoDAO = new MedicoDAOImpl();
    }

    public void entidadeParaTela(Medico m) {
        if (m != null) {
            this.id.set(m.getId());
            this.crm.set(m.getCrm());
            this.nome.set(m.getNome());
            this.telefone.set(m.getTelefone());
            this.email.set(m.getEmail());
            this.especialidade.set(m.getEspecialidade());
        }
    }

    public void excluir(Medico m) throws MedicoException {
        System.out.println("Excluido paciente com nome: " + m.getNome());
        lista.remove(m);
        medicoDAO.remover(m);
        pesquisarTodos();
        limparTudo();
    }

    public void gravar() throws MedicoException {
        Medico medico = new Medico();
        medico.setNome(this.nome.get());
        medico.setTelefone(this.telefone.get());
        medico.setEmail(this.email.get());
        medico.setEspecialidade(this.especialidade.get());
        medico.setCrm(this.crm.get());

        if (id.get() == 0) {
            contador += 1;
            medico.setId(contador);
            lista.add(medico);
            medicoDAO.inserir(medico);
        } else {
            for (Medico m : lista) {
                if (m.getId() == this.id.get()) {
                    m.setCrm(this.crm.get());
                    m.setNome(this.nome.get());
                    m.setTelefone(this.telefone.get());
                    m.setEmail(this.email.get());
                    m.setEspecialidade(this.especialidade.get());
                    medicoDAO.atualizar(m);
                }
            }
        }
        pesquisarTodos();
        limparTudo();
        System.out.println("Lista tamanho: " + lista.size());
    }

    public void limparTudo() {
        id.set(0);
        crm.set("");
        nome.set("");
        telefone.set("");
        email.set("");
        especialidade.set("");
    }

    public void pesquisarPorNome() throws MedicoException {
        for (Medico m : lista) {
            if (m.getNome().contains(nome.get())) {
                nome.set(m.getNome());
                telefone.set(m.getTelefone());
                email.set(m.getEmail());
                especialidade.set(m.getEspecialidade());
                crm.set(m.getCrm());
            }
        }
    }

    public void pesquisarTodos() throws MedicoException {
        lista.clear();
        lista.addAll(medicoDAO.pesquisarTodos());
    }

    public IntegerProperty idProperty() {
        return this.id;
    }

    public StringProperty crmProperty() {
        return this.crm;
    }

    public ObservableList<Medico> getLista() {
        return this.lista;
    }

    public StringProperty nomeProperty() {
        return this.nome;
    }

    public StringProperty telefoneProperty() {
        return this.telefone;
    }

    public StringProperty emailProperty() {
        return this.email;
    }

    public StringProperty especialidadeProperty() {
        return this.especialidade;
    }

}