package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controler-log-out")
public class ControlerLogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			System.out.println("Destruindo sessao...");
			request.getSession().invalidate();
							
			response.sendRedirect("pagina-login.html");
		} catch (Exception ex) {
			System.err.println("controler-log-out " + ex);
		}
		
	}

}
