package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.modelo.Carrinho;
import br.com.modelo.Produto;

@WebServlet("/loja")
public class adicionandoProdutoSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try{
			/*Verificando Sessão*/
			HttpSession session = req.getSession();
			ArrayList<Produto> lista_produtos = (ArrayList<Produto>) session.getAttribute("lista_produtos");

			if(lista_produtos == null){
				lista_produtos = new ArrayList<Produto>();
				session.setAttribute("lista_produtos", lista_produtos);
			}

			/*Criando o Produto*/
			int codigo = Integer.parseInt( req.getParameter("codigo") );
			String nome = req.getParameter("nome");
			double preco = Double.parseDouble(req.getParameter("preco"));
			int quantidade = Integer.parseInt( req.getParameter("quantidade"));
			String descricao = req.getParameter("descricao");


			Produto novoProduto = new Produto(codigo,nome,descricao,quantidade);

			lista_produtos.add(novoProduto);

			res.getWriter().print(lista_produtos);

			PrintWriter out = res.getWriter();



			for(Produto item : lista_produtos){

				String msg = ("[ Codigo: " + item.getCodigo() + " " +
						"Nome: " + item.getNome() + " " +
						"Descricao: " + item.getDescricao() + " " +
						"Quantidade: " + item.getQuantidade() + " " +
						"Preco Unitario: " + preco + " " +
						"Preco Total: " + (preco * item.getQuantidade()) + " ]"
						);

				out.println(msg);
			}
		}catch (Exception e) {
			System.err.println("Erro:" + e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
