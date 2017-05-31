package br.com.lista10.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lista10.dao.ProdutoDao;
import br.com.lista10.model.Produto;

/**
 * Servlet implementation class AdicionarControllerServlet - Naélio Freires
 */
@WebServlet({ "/AdicionarControllerServlet", "/adicionar" })
public class AdicionarControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		float valor = Float.parseFloat(request.getParameter("valor"));
		
		new ProdutoDao().adiciona(new Produto(nome,descricao,valor));
		
		request.getRequestDispatcher("/listar").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
