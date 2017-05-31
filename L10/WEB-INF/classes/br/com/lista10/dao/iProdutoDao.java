package br.com.lista10.dao;

import java.util.List;

import br.com.lista10.model.Produto;

public interface iProdutoDao {

	void adiciona(Produto produto);

	public List<Produto> getLista();

	void altera(Produto produto);

	void remove(Long id);
}
