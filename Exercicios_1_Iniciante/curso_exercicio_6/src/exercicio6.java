import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B
		Locale.setDefault(Locale.US);
		double A, B, C;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor de A: ");
		A = leitor.nextDouble();
		System.out.print("Informe o valor de B: ");
		B = leitor.nextDouble();
		System.out.print("Informe o valor de C: ");
		C = leitor.nextDouble();
		
		//calculos
		double triReta = (A * C) / 2;
		double circulo = 3.14159 * Math.pow(C, 2);
		double trapezio = (A + B) * C / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		
		System.out.println("ÁREAS: ");
		System.out.printf(" TRIANGULO: %.3f %n CIRCULO: %.3f %n TRAPEZIO: %.3f %n QUADRADO: %.3f %n RETANGULO: %.3f %n", triReta, circulo, trapezio, quadrado, retangulo);
		//System.out.printf("TRIANGULO: %.3f", triReta);
		//System.out.printf("CIRCULO: %.3f", circulo);
		//System.out.printf("TRAPEZIO: %.3f", trapezio);
		//System.out.printf("QUADRADO: %.3f", quadrado);
		//System.out.printf("RETANGULO: %.3f", retangulo);
		
		leitor.close();
	}

}
