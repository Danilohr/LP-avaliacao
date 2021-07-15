package daniloAvaliaçãoPrática;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qItens;
		
		System.out.print("Quantos itens diferentes deseja comprar: ");
		qItens = scan.nextInt();
		scan.nextLine();
		
		Item item[] = new Item[qItens];
		Fatura fatura = new Fatura();
		
		for(int i=0;i<qItens;i++) {
			System.out.print("Descrição do produto "+(i+1)+": ");
			String descricao = scan.nextLine();
			System.out.print("Valor do produto: ");
			Double vProduto = scan.nextDouble();
			System.out.print("Quantidade do produto: ");
			int qProduto = scan.nextInt();
			scan.nextLine();
			
			Produto produto = new Produto(descricao, vProduto);
			item[i] = new Item(qProduto, produto);
			fatura.setValorFatura(item[i].getValorTotal());
			
		}
		System.out.println("************TOTAL DA COMPRA************\n");
		for(int i=0;i<qItens;i++) {
			System.out.println("Produto: "+item[i].produto.getNome()+"   Valor: "+item[i].produto.getValor()+"   Quantidade: "+item[i].getQuantidade());
		}
		System.out.printf("Sua fatura é de: R$%.2f",fatura.getValorFatura());
		scan.close();
	}

}
