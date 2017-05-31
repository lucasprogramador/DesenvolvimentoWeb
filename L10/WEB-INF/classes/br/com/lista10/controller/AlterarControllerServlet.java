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
 * Servlet implementation class AlterarControllerServlet
 */
@WebServlet({ "/AlterarControllerServlet", "/alterar-produto" })
public class AlterarControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Long id_x = Long.parseLong(request.getParameter("id-x"));
			String novo_nome = request.getParameter("novo-nome");
			String nova_descricao = request.getParameter("nova-descricao");
			Float novo_valor = Float.parseFloat(request.getParameter("novo-valor"));
					
			new ProdutoDao().altera( new Produto(id_x,novo_nome,nova_descricao,novo_valor));
			request.getRequestDispatcher("/listar").forward(request, response);
			
		} catch (Exception e) {
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
