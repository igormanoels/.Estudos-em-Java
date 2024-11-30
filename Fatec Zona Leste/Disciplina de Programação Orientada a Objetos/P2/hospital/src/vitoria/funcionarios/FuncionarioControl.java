package vitoria.funcionarios;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FuncionarioControl {

    private ObservableList<Funcionario> lista = FXCollections.observableArrayList();
    private IntegerProperty id = new SimpleIntegerProperty(0);
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty telefone = new SimpleStringProperty("");
    private StringProperty email = new SimpleStringProperty("");
    private StringProperty senha = new SimpleStringProperty("");
    private StringProperty setor = new SimpleStringProperty("");

    private int contador = 0;

    private FuncionarioDAO funcionarioDAO;

    public FuncionarioControl() throws FuncionarioException {
        funcionarioDAO = new FuncionarioDAOImpl();
    }

    public void entidadeParaTela(Funcionario f) {
        if (f != null) {
            this.id.set(f.getId());
            this.nome.set(f.getNome());
            this.telefone.set(f.getTelefone());
            this.email.set(f.getEmail());
            this.senha.set(f.getSenha());
            this.setor.set(f.getSetor());
        }
    }

    public void excluir(Funcionario f) throws FuncionarioException {
        System.out.println("Excluido paciente com nome: " + f.getNome());
        lista.remove(f);
        funcionarioDAO.remover(f);
        pesquisarTodos();
    }

    public void gravar() throws FuncionarioException {
        if (id.get() == 0) {
            Funcionario f = new Funcionario();
            contador += 1;
            f.setId(contador);
            f.setNome(this.nome.get());
            f.setEmail(this.email.get());
            f.setSenha(this.senha.get());
            f.setTelefone(this.telefone.get());
            f.setSetor(this.setor.get());
            lista.add(f);
            funcionarioDAO.inserir(f);
        } else {
            for (Funcionario f : lista) {
                if (f.getId() == this.id.get()) {
                    f.setNome(this.nome.get());
                    f.setEmail(this.email.get());
                    f.setSenha(this.senha.get());
                    f.setTelefone(this.telefone.get());
                    f.setSetor(this.setor.get());
                    funcionarioDAO.atualizar(f);
                }
            }
        }
        pesquisarTodos();
        limparTudo();
        System.out.println("Lista tamanho: " + lista.size());
    }

    public void limparTudo() {
        id.set(0);
        nome.set("");
        senha.set("");
        telefone.set("");
        email.set("");
        senha.set("");
        setor.set("");
    }

    // A fazer: pesquisar no banco
    public void pesquisarPorNome() throws FuncionarioException {
        for (Funcionario f : lista) {
            if (f.getNome().contains(nome.get())) {
                nome.set(f.getNome());
                email.set(f.getEmail());
                senha.set(f.getSenha());
                telefone.set(f.getTelefone());
                setor.set(f.getSetor());
                // break;
            }
        }
    }

    public void pesquisarTodos() throws FuncionarioException {
        lista.clear();
        lista.addAll(funcionarioDAO.pesquisarTodos());
    }

    public ObservableList<Funcionario> getLista() {
        return this.lista;
    }

    public IntegerProperty idProperty() {
        return this.id;
    }

    public StringProperty nomeProperty() {
        return this.nome;
    }

    public StringProperty senhaProperty() {
        return this.senha;
    }

    public StringProperty telefoneProperty() {
        return this.telefone;
    }

    public StringProperty emailProperty() {
        return this.email;
    }

    public StringProperty cargoProperty() {
        return this.senha;
    }

    public StringProperty setorProperty() {
        return this.setor;
    }

}