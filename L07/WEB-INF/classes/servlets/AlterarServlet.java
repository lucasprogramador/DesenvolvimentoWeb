package servlets;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Tarefa;


@WebServlet({ "/AlterarServlet", "/alterar" })
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String msg = "";
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeOld = request.getParameter("nome-old");
		String nomeNew = request.getParameter("nome-new");
		String desc = request.getParameter("desc");
		TreeMap<String, Tarefa> lista = (TreeMap<String, Tarefa>) request.getSession().getAttribute("lista");
		Tarefa novo;
		
		if(!lista.isEmpty()){
			if(lista.get(nomeOld) != null){
				if(desc != ""){ 
					novo = new Tarefa(nomeNew, desc);
					lista.remove(nomeOld);
					lista.put(novo.getName(), novo);
				}else{				
					novo = new Tarefa(nomeNew,lista.get(nomeOld).getDesc());
					lista.put(novo.getName(), novo);
					lista.remove(nomeOld);
				}
					
			}
		}
		
		for(Tarefa object : lista.values()){
			msg = "<tr><td>	Nome:  " + object.getName() + "</td></tr>" +
					"<tr><td> Descricao:  " + object.getDesc() + "</td></tr> " +
					"<br> <br> <br>";
			response.getWriter().println(msg);
		}

	}

}
