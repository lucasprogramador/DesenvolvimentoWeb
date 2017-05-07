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



@WebServlet({ "/RemoverServlet", "/remover" })
public class RemoverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String msg = "";
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String nome = request.getParameter("nome");
			HttpSession session = request.getSession();
			TreeMap<String, Tarefa> lista = (TreeMap<String, Tarefa>) session.getAttribute("lista");
			
			if(!lista.isEmpty())
				lista.remove(nome);
			
			for(Tarefa object : lista.values()){
				msg  = "<tr><td>	Nome:  " + object.getName() + "</td></tr>" +
						"<tr><td> Descricao:  " + object.getDesc() + "</td></tr> " +
						"<br> <br> <br>";
				response.getWriter().println(msg);
			}
			
		} catch (Exception ex) {
			System.err.println("RemoverServlet: " + ex);
		}
		
	}

}
