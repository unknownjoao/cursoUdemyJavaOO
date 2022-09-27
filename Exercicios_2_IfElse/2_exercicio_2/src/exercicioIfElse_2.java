import java.util.Scanner;

public class exercicioIfElse_2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int n1 = leitor.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

}
