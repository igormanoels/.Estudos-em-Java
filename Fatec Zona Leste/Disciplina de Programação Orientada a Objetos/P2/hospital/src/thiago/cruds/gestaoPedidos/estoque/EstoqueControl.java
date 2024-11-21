package thiago.cruds.gestaoPedidos.estoque;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EstoqueControl {

  private ObservableList<Estoque> lista = FXCollections.observableArrayList();
  private IntegerProperty id = new SimpleIntegerProperty(0);
  private StringProperty medicamento = new SimpleStringProperty("");
  private IntegerProperty quantidade = new SimpleIntegerProperty(0);
  private StringProperty fornecedor = new SimpleStringProperty("");
  private IntegerProperty funcionarioRegistro = new SimpleIntegerProperty(0);

  private int contador = 0;

  private EstoqueDAO estoqueDAO;

  public EstoqueControl() throws EstoqueException{
    estoqueDAO = new EstoqueDAOImpl();
  }

  public void entidadeParaTela(Estoque e) {
    if (e != null) {
      this.id.set(e.getId());
      this.medicamento.set(e.getMedicamento());
      this.quantidade.set(e.getQuantidade());
      this.fornecedor.set(e.getFornecedor());
      this.funcionarioRegistro.set(e.getFuncionarioRegistro());
    }
  }

  public void gravar() throws EstoqueException {
    // coloca os valores dos campos da tela na entidade
    Estoque e = new Estoque();
    e.setMedicamento(this.medicamento.get());
    e.setQuantidade(this.quantidade.get());
    e.setFornecedor(this.fornecedor.get());
    e.setFuncionarioRegistro(this.funcionarioRegistro.get());

    // se o id da tela for = 0, então é novo registro
    if (id.get() == 0) {
      contador += 1;
      e.setId(contador);
      // insere no banco com os valores da entidade
      estoqueDAO.inserir(e);

    } else {
      // Caso contrario foi selecionado um item já existente para ser atualizado
      e.setId(id.get());
      estoqueDAO.atualizar(e);
    }
    pesquisarTodos();
    limparTudo();
    System.out.println("Tamanho da Lista: " + lista.size());

  }

  public void limparTudo() {
    id.set(0);
    medicamento.set("");
    quantidade.set(0);
    fornecedor.set("");
    funcionarioRegistro.set(0);
  }

  public void excluir(Estoque e) throws EstoqueException {
    System.err.println("Excluindo pedido de medicamento com id: " + e.getId());
    estoqueDAO.remover(e);
    pesquisarTodos();
  }

  public void pesquisarPorMedicamento() throws EstoqueException {
    lista.clear();
    lista.addAll(estoqueDAO.pesquisarPorMedicamento(medicamento.get()));
  }

  public void pesquisarTodos() throws EstoqueException {
    lista.clear();
    lista.addAll(estoqueDAO.pesquisarTodos());
  }

  public ObservableList<Estoque> getLista() {
    return lista;
  }

  public IntegerProperty idProperty() {
    return id;
  }

  public StringProperty medicamentoProperty() {
    return medicamento;
  }

  public IntegerProperty quantidadeProperty() {
    return quantidade;
  }

  public StringProperty fornecedorProperty() {
    return fornecedor;
  }

  public IntegerProperty funcionarioRegistroProperty() {
    return funcionarioRegistro;
  }

}
