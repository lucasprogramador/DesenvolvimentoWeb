package br.com.lista10.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lista10.dao.ProdutoDao;

/**
 * Servlet implementation class EditarExcluirControllerServlet - Naelio Freires
 */
@WebServlet({ "/EditarExcluirControllerServlet", "/deletar" })
public class ExcluirControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			new ProdutoDao().remove(Long.parseLong(request.getParameter("id")));
			request.getRequestDispatcher("/listar").forward(request, response);

		} catch (Exception e) {

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
