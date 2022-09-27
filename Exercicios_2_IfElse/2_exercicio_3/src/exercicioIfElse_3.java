import java.util.Scanner;

public class exercicioIfElse_3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Valor A: ");
		int n1 = leitor.nextInt();
		System.out.println("Valor B: ");
		int n2 = leitor.nextInt();
		
		if (n1 % 2 == 0 && n2 % 2 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
	}

}
