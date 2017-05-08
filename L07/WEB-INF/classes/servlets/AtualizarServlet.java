package servlets;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Tarefa;

@WebServlet({ "/AtualizarServlet", "/atualizar" })
public class AtualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String msg = "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			TreeMap<String, Tarefa> lista = (TreeMap<String, Tarefa>) request.getSession().getAttribute("lista");

			if(lista != null){
				for(Tarefa object : lista.values()){
					msg = "<tr><td>	Nome:  " + object.getName() + "</td></tr>" +
							"<tr><td> Descricao:  " + object.getDesc() + "</td></tr> " +
							"<br> <br> <br>";
					response.getWriter().println(msg);
				}
			}else{
				response.getWriter().println("Lista Vazia");
			}

		} catch (Exception ex) {
			System.out.println("Atualizar: " + ex);
		}


	}

}
