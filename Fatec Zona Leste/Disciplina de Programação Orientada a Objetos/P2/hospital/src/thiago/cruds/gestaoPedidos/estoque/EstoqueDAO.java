package thiago.cruds.gestaoPedidos.estoque;

import java.util.List;

public interface EstoqueDAO {

  void inserir(Estoque e) throws EstoqueException;

  void atualizar(Estoque e) throws EstoqueException;

  void remover(Estoque e) throws EstoqueException;

  List<Estoque> pesquisarPorMedicamento(String medicamento) throws EstoqueException;

  List<Estoque> pesquisarTodos() throws EstoqueException;

}
