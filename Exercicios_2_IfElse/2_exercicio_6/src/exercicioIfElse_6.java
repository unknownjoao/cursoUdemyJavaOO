import java.util.Locale;
import java.util.Scanner;

public class exercicioIfElse_6 {

	public static void main(String[] args) {
		//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		double valor = leitor.nextDouble();
		
		if (valor < 0.0 || valor > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (valor <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (valor <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
	}

}
