package programa;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double n1,n2,n3,md;
		String nome;
		
		
		System.out.println("Insira o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Terceira nota: ");
		n3 = sc.nextDouble();
		
		md = (n1+n2+n3)/3;
		
		
		
		
		
		
		if (md < 7 && md >= 0) {
			System.out.println("------------------------");
			System.out.println("Aluno: "+nome);
			System.out.println("------------------------");
			System.out.println("REPROVADO, media de: "+md);
		}
		else if (md <= 10 && md >=7) {
			System.out.println("------------------------");
			System.out.println("Aluno: "+nome);
			System.out.println("------------------------");
			System.out.println("APROVADO, media de:  "+md);
		}
		else {
			System.out.println("Nota invalida: "+md);
		} 
		sc.close();
	}
		

}
