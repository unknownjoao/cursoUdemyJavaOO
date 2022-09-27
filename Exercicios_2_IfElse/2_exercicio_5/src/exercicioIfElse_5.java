import java.util.Scanner;

public class exercicioIfElse_5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int cod, qnt;
		//cardapio
		double n1, n2, n3, n4, n5, valor = 0;
		//valores
		n1 = 4.00;
		n2 = 4.50;
		n3 = 5.00;
		n4 = 2.00;
		n5 = 1.50;
		
		System.out.println("Informe o código do item: ");
		cod = leitor.nextInt();
		System.out.println("Quantas unidades: ");
		qnt = leitor.nextInt();
		
		if(cod == 1){
			 valor = n1 * qnt;
		}else if (cod == 2) {
			 valor = n2 * qnt;
		}else if (cod == 3) {
			 valor = n3 * qnt;
		}else if (cod == 4) {
			 valor = n4 * qnt;
		}else if (cod == 5) {
			 valor = n5 * qnt;
		}
		
		System.out.printf("Total: R$ %.2f", valor);
		leitor.close();
	}

}
