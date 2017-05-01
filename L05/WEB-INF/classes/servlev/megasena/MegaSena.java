package servlev.megasena;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MegaSena
 */
@WebServlet("/megasena")
public class MegaSena extends HttpServlet {

	private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 	
    	List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 1; i < 61; i++) { 
		    numeros.add(i);
		}
		numeros.toString();
		
		Collections.shuffle(numeros);
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h3>Numeros Sorteados </h3>");
		out.println("Numero 1: " + numeros.get(0) + "<br>");
		out.println("Numero 2: "  + numeros.get(1) + "<br>");
		out.println("Numero 3: "  + numeros.get(2) + "<br>");
		out.println("Numero 4: "  + numeros.get(3) + "<br>");
		out.println("Numero 5: "  + numeros.get(4) + "<br>");
		out.println("Numero 6: "  + numeros.get(5) + "<br>");
		out.println("<h5>	atualize para gerar novos números </h5>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

    }
	
}
