package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/soma")
public class Soma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		float numero01 = Float.parseFloat(request.getParameter("A"));
		float numero02 = Float.parseFloat(request.getParameter("B"));
		request.setAttribute("soma", numero01+numero02);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);		
	}

	

}
