package daniloAvaliaçãoPrática;

public class Fatura {
	private double valorFatura = 0.0;

	public Fatura() {
	}
	
	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorAdicionar) {
		valorFatura += valorAdicionar;
	}
	
	
}
