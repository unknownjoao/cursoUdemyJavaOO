import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do raio do círculo: ");
		double raio = leitor.nextDouble();
		
		double resultado = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", resultado);
		
		leitor.close();

	}

}
