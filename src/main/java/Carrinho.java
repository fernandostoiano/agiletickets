
public class Carrinho {

	private Item item;

	public Carrinho(Item item) {
		this.item = item;
	}

	public Double getMaiorPreco() {
		
		return item.getPreco();
	}

	public void adionarItem(Item item) {
		this.item = item;
		
	}
	
}
