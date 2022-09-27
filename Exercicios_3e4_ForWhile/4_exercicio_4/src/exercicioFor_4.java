import java.util.Locale;
import java.util.Scanner;

public class exercicioFor_4 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor N: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n2 == 0) {
				System.out.println("divisão impossivel");
			} else {
				double div = (double) n1 / n2;
				System.out.println(div);
			}
		}
		sc.close();
	}

}
