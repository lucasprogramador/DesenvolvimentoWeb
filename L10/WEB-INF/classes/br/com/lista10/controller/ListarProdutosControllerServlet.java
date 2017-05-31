package br.com.lista10.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lista10.dao.ProdutoDao;
import br.com.lista10.model.Produto;

/**
 * Servlet implementation class ListarProdutosControllerServlet	- Naélio Freires
 */
@WebServlet({ "/ListarProdutosControllerServlet", "/listar" })
public class ListarProdutosControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			request.setAttribute("produtos", getLista());
			request.getRequestDispatcher("/lista_de_protudos.jsp").forward(request, response);
			
		}catch (Exception e) {
			System.out.println("Erro no ListarProdutosControllerServlet: " + e);
		} 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public ArrayList<Produto> getLista(){
		return (ArrayList<Produto>) new ProdutoDao().getLista();
	}
}
