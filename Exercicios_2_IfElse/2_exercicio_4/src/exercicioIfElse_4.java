import java.util.Scanner;

public class exercicioIfElse_4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Hora Inicial:");
		int hora1 = leitor.nextInt();
		System.out.println("Hora Final:");
		int hora2 = leitor.nextInt();
	
		int duracao;
		
		if (hora1 < hora2) {
			duracao = hora2 - hora1;
		}else {
			duracao = 24 - hora1 + hora2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		leitor.close();
	}
}
