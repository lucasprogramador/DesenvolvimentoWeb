package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/CalculoImc", "/imc" })
public class CalculoImc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		float peso = Float.parseFloat(request.getParameter("peso"));
		float altura = Float.parseFloat(request.getParameter("altura"));

		float resultado = peso / (altura * altura);
		request.setAttribute("resultado", resultado);	

		String situacao = null;

		if(resultado < 16){
			situacao = "Magreza Grave!";
		}else if(resultado < 17){
			situacao = "Magreza Moderada!";
		}else if(resultado < 18.5){
			situacao = "Magreza Leve!";
		}else if(resultado < 25){
			situacao = "Saudável!";
		}else if(resultado < 30){
			situacao = "Sobrepeso!";
		}else if(resultado < 35){
			situacao = "Obesidade Grau I!";
		}else if(resultado < 40){
			situacao = "Obesidade Grau II (severa)!";
		}else if(resultado > 40){
			situacao = "Obesidade Grau  III (mórbida)";
		}

		request.setAttribute("situacao", situacao);

		RequestDispatcher dispacho = request.getRequestDispatcher("imc.jsp");
		dispacho.forward(request, response);

	}

}
