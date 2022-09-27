import java.util.Locale;
import java.util.Scanner;

public class exercicioIfElse_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor de X: ");
		double x1 = leitor.nextDouble();
		System.out.println("Informe o valor de Y: ");
		double y1 = leitor.nextDouble();

		
		if(x1 < 0 && y1 < 0) {
			System.out.println("Q3");
		} else if(x1 > 0 && y1 > 0) {
			System.out.println("Q1");
		} else if(x1 > 0 && y1 < 0) {
			System.out.println("Q4");
		} else if(x1 < 0 && y1 > 0) {
			System.out.println("Q2");
		} else if(x1 == 0 && y1 == 0) {
			System.out.println("Origem");
		}
		leitor.close();
	}

}
