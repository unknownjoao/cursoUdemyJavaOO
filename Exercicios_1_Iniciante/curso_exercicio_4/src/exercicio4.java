import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais
		
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Numero/ID: ");
		int id = leitor.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		double horas = leitor.nextDouble();
		
		System.out.println("Quantos você recebe por hora? ");
		double recebe = leitor.nextDouble();
		
		double salario = horas * recebe;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY U$ = %.2f", salario);
		
		leitor.close();
	
	}

}
