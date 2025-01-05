package estrutura_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsuis: ");
		double C = scanner.nextDouble();
		double F = 9.0 * C / 5 + 32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)? ");
		char resp = scanner.next().charAt(0);
		
		scanner.close();

	}

}
