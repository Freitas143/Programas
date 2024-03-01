package programa;

import java.util.Scanner;

public class menu {
	public static void main (String[]args) throws InterruptedException {
	Scanner sr = new Scanner (System.in);
	System.out.println(" ----------------------------- ");
	System.out.println(" BEM - VINDO A PIZZZARIA DO GG ");
	System.out.println(" ----------------------------- ");
	Thread.sleep(2000);
	System.out.print(" Informe seu nome:  ");
	String nome = sr.nextLine();
	System.out.print(" Informe seu telefone: [+55] (15) ");
	int telefone = sr.nextInt();
	
	
	//String resp = "s";
	int opcoes = 0;
	double carrinho = 0;
	
		
	System.out.println("------------- MENU -------------");
	System.out.println("[1]  - Pizza de Calabresa      (R$ 25,00)");
	System.out.println("[2]  - Pizza de Quatro Queijos (R$ 20,00)");
	System.out.println("[3]  - Pizza de Camarão        (R$ 35,00)");
	System.out.println("[4]  - Pizza de Portuguesa     (R$ 25,00)");
	System.out.println("[5]  - Pizza Baiana            (R$ 25,00)");
	System.out.println("[51] - Imprimir comanda                  ");
	System.out.println("--------------------------------");
	System.out.println("Digite a opção desejada: ");
	opcoes = sr.nextInt();
	
	while (opcoes != 51) {
		if (opcoes == 1) {
			carrinho = carrinho + 25.00;
		}
	    else if (opcoes == 2) {
			carrinho = carrinho + 20.00;
		}
	    else if (opcoes == 3) {
			carrinho = carrinho + 35.00;
		}
	    else if (opcoes == 4) {
			carrinho = carrinho + 25.00;
		}
	    else if (opcoes == 5) {
			carrinho = carrinho + 25.00;
		}
		Thread.sleep(1000);
	
		System.out.println("------------- MENU -------------");
		System.out.println("[1]  - Pizza de Calabresa      (R$ 25,00)");
		System.out.println("[2]  - Pizza de Quatro Queijos (R$ 20,00)");
		System.out.println("[3]  - Pizza de Camarão        (R$ 35,00)");
		System.out.println("[4]  - Pizza de Portuguesa     (R$ 25,00)");
		System.out.println("[5]  - Pizza Baiana            (R$ 25,00)");
		System.out.println("[51] - Imprimir comanda                  ");
		System.out.println("--------------------------------");
		System.out.println("Digite a opção desejada: ");
		opcoes = sr.nextInt();
		}
	Thread.sleep(1000);
	System.out.println(" ----- PEDIDO ANOTADO ----- !!!");
	System.out.println(" Cliente:           "+nome);
	System.out.println(" Telefone:          "+telefone);
	System.out.println(" TOTAL A PAGAR : R$ "+carrinho);

	sr.close();
		
		
	
	}
	
	
}
