package servlet.addsub;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adicao-subtracao")
public class addSub extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String x = request.getParameter("x");
		float xF = Float.parseFloat(x);

		String y = request.getParameter("y");
		float yF = Float.parseFloat(y);
		
		float adicao = xF + yF;
		float subtracao = xF - yF;
		
		PrintWriter saidaAddSub = response.getWriter();

		saidaAddSub.println("<html>");
		saidaAddSub.println("<body>");
		saidaAddSub.println("<h3> Adicao: " + adicao + "</h3>");  
		saidaAddSub.println("<h3> Subtraca: " + subtracao + "</h3>");
		saidaAddSub.println("</body>");
		saidaAddSub.println("</html>");
	}
}
