import java.util.Scanner;

public class exercicioWhile_3 {

	public static void main(String[] args) {
		//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		//exemplo.
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("1.Álcool 2.Gasolina 3.Diesel");
		System.out.println("Insira o código: ");
		codigo = leitor.nextInt();
		
		while(codigo != 4) {
			if(codigo > 4) {
				System.out.println("Codigo inválido!");
			} else if(codigo == 1) {
				alcool += 1;
			} else if(codigo == 2) {
				gasolina += 1;
			} else if(codigo == 3) {
				diesel += + 1;
			}
			codigo = leitor.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		leitor.close();
	}

}
