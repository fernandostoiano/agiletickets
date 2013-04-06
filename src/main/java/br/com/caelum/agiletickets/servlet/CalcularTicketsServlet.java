package br.com.caelum.agiletickets.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcularTicketsServlet extends HttpServlet {

	private static final long serialVersionUID = 6392702674147158085L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		
			
		Extratora extratora = new Extratora(request);
		Double precoTotal = extratora.calcula();
		
		request.setAttribute("precoTotal", precoTotal);
		
		//response.sendRedirect("");
		
	}

}
