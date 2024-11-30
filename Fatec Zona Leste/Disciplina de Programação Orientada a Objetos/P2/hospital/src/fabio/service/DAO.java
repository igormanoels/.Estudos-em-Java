package fabio.service;

import java.util.List;

public interface DAO<T> {

	public void inserir(T objeto) throws GenericException;

	public void atualizar(T objeto) throws GenericException;

	public void remover(T objeto) throws GenericException;

	public List<T> pesquisar(String itemPesquisa) throws GenericException;

	public List<T> pesquisarTodos() throws GenericException;

}