import java.util.Scanner;

public class exercicioFor_7 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		//exemplo.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número positivo: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int aoquad = (int) Math.pow(i, 2);
			int aocub = (int) Math.pow(i, 3);
			
			System.out.println(i + " " + aoquad + " " + aocub);
		}
		sc.close();
	}

}
