package daniloAvaliaçãoPrática;

public class Item {
	private Integer quantidade;
	private double valorTotal;
	public Produto produto;
	
	public Item(Integer quantidade, Produto nProduto) {
		this.quantidade = quantidade;
		this.produto = nProduto;
		valorTotal = produto.getValor()*this.quantidade;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
