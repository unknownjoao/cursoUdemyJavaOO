import java.util.Scanner;

public class exercicioFor_1 {

	public static void main(String[] args) {
		//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		//X, se for o caso.
		
		Scanner leitor = new Scanner(System.in);
		
		int x;
		System.out.println("Insira um número inteiro: ");
		x = leitor.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		leitor.close();
	}

}
