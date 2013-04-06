import org.junit.Assert;
import org.junit.Test;


public class CarrinhoTest {
	
	@Test
	public void testaComUmProduto() throws Exception {
		
		Carrinho c = new Carrinho(new Item("Bola", 10.0));
		
		Double preco = c.getMaiorPreco();
		
		Assert.assertEquals(10.0, preco, 0.001);
	}
	
	@Test
	public void testaComDoisProduto() throws Exception {
		
		Carrinho c = new Carrinho(new Item("Bola", 10.0));
		c.adionarItem(new Item("Quadrado", 15.0));
		
		Double preco = c.getMaiorPreco();
		
		Assert.assertEquals(15.0, preco, 0.001);
	}
	
}
