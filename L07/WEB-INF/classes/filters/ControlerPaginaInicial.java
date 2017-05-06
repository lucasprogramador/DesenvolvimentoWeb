package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/pagina-inicial.html"}) 
public class ControlerPaginaInicial implements Filter {


	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		try {
			
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;

			HttpSession session = req.getSession();

			if(session.getAttribute("usr") == "admin"){
				System.out.println("logado");				
				
			}else{
				System.out.println("nao logado");
				res.sendRedirect("pagina-login.html");
			}

		} catch (Exception ex) {
			System.out.println("ControlerPaginaInicial - Filter" + ex);
			
		}finally {
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
