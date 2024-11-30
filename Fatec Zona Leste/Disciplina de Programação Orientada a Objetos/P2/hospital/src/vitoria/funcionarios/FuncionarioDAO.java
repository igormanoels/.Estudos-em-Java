package vitoria.funcionarios;

import java.util.List;

public interface FuncionarioDAO {

    void inserir(Funcionario f) throws FuncionarioException;

    void atualizar(Funcionario f) throws FuncionarioException;

    void remover(Funcionario f) throws FuncionarioException;

    List<Funcionario> pesquisarPorNome(String nome) throws FuncionarioException;

    List<Funcionario> pesquisarTodos() throws FuncionarioException;

}