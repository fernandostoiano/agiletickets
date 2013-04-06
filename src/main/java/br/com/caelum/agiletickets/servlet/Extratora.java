package br.com.caelum.agiletickets.servlet;

import javax.servlet.http.HttpServletRequest;

public class Extratora {
	
	private HttpServletRequest request;
	
	public Extratora(HttpServletRequest request) {
		this.request = request;
	}
	
	public Double calcula() {
		
		String precoString = this.request.getParameter("preco");
		String quantidadeString = this.request.getParameter("quantidade");
		
		Double preco = Double.parseDouble(precoString);
		Double quantidade = Double.parseDouble(quantidadeString);
		
		Double precoTotal = preco * quantidade;
		
		return precoTotal;
		
	}

}
