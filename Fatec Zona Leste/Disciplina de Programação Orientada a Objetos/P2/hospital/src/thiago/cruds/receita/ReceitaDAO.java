package thiago.cruds.receita;

import java.util.List;

public interface ReceitaDAO {

  public boolean pesquisarMedicamento(List<String> medicamentos) throws ReceitaException;

  public List<String> buscarListaMed(List<String> medicamentos) throws ReceitaException;

  public void inserir(Receita r) throws ReceitaException;

  public void atualizar(Receita r) throws ReceitaException;

  public void remover(Receita r) throws ReceitaException;

  public List<Receita> pesquisarPorCRM(String crm) throws ReceitaException;

  public List<Receita> pesquisarTodos() throws ReceitaException;
}
