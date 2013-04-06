package br.com.caelum.agiletickets.servlet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.Test;


public class ExtratoraTest {

	
	
	@Test
	public void calculaValorTotalTest() throws Exception {
		
		HttpServletRequest request = mock(HttpServletRequest.class);
		when(request.getParameter("preco")).thenReturn("40");
		when(request.getParameter("quantidade")).thenReturn("5");
		
		Extratora extratora = new Extratora(request);
		
		Double valorTotal = extratora.calcula();
		Double teste = 200.0;
		
		Assert.assertEquals(valorTotal, teste);
		
	}
	
}
