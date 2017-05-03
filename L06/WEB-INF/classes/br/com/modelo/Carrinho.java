package br.com.modelo;

import java.awt.List;
import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> itens = new ArrayList<Produto>();

	public Carrinho() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Produto> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Produto> itens) {
		this.itens = itens;
	}

	public void adiciona(Produto item) {
		itens.add(item);
		
	}


}
