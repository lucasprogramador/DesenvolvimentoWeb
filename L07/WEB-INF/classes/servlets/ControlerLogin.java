package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/controler-login")
public class ControlerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("login").equals("admin") && request.getParameter("senha").equals("teste1234")){
			request.getSession().invalidate();
			HttpSession session = request.getSession(true);
			session.setAttribute("usr", "admin");
			response.sendRedirect("pagina-inicial.html");
		}else{
			response.sendRedirect("pagina-login.html");
		}
	}

}
