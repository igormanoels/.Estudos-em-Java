package vitoria.medicos;

import java.util.List;

public interface MedicoDAO {

    void inserir(Medico m) throws MedicoException;

    void atualizar(Medico m) throws MedicoException;

    void remover(Medico m) throws MedicoException;

    List<Medico> pesquisarPorNome(String nome) throws MedicoException;

    List<Medico> pesquisarTodos() throws MedicoException;

}