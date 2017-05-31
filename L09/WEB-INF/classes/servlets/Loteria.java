package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loteria")
public class Loteria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> aux = new ArrayList<Integer>();
		
		for (int i = 1; i < 61; i++)
			numeros.add(i);
		
		numeros.toString();

		Collections.shuffle(numeros);
		
		for(int i = 0; i < 6; i++)
			aux.add(numeros.get(i));
			
		request.setAttribute("numeros",aux);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
