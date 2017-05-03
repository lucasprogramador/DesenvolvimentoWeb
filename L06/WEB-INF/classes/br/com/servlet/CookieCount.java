package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contadorServ")
public class CookieCount extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{

			int contador = 0;

			response.setContentType("text/html");  

			Cookie allCookies[] = request.getCookies();			
			PrintWriter out = response.getWriter();
			Cookie cookie = null;

			for(Cookie atual : allCookies){
				if(atual.getName().equals("usr")){
					cookie = atual;
					contador = Integer.parseInt(atual.getValue()); // getValue retorna uma String
				}
			}

			if(cookie == null){				
				Cookie ck = new Cookie("usr", Integer.toString(contador));// Creating cookie object
				ck.setMaxAge(2592000); // 1 Month		     
			}
			
			contador++;
			cookie.setValue(Integer.toString(contador));
			response.addCookie(cookie);// Adding cookie in the response 
			
			RequestDispatcher rd = request.getRequestDispatcher("contador.html");
			rd.forward(request, response);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
