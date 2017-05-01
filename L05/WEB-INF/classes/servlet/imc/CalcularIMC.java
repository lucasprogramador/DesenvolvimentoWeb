package servlet.imc;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculo")
public class CalcularIMC extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String altura = request.getParameter("altura");
		float alturaF = Float.parseFloat(altura);

		String peso = request.getParameter("peso");
		float pesoF = Float.parseFloat(peso);

		float resultado = (pesoF / (alturaF * alturaF));

		String situacao = "";

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

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h3> Resultado: " + resultado + "</h3>");  
		out.println("<h3> Situação atual: " + situacao + "</h3>");
		out.println("</body>");
		out.println("</html>");
		String x = request.getParameter("x");
		float xF = Float.parseFloat(x);

		String y = request.getParameter("y");
		float yF = Float.parseFloat(y);
		
		float adicao = xF + yF;
		float subtracao = xF - yF;
		
		PrintWriter saidaIMC = response.getWriter();

		saidaIMC.println("<html>");
		saidaIMC.println("<body>");
		saidaIMC.println("<h3> Adicao: " + adicao + "</h3>");  
		saidaIMC.println("<h3> Subtraca: " + subtracao + "</h3>");
		saidaIMC.println("</body>");
		saidaIMC.println("</html>");
	}
}
