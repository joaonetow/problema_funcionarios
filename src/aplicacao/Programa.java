package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura dos dados

		String nome;
		double valorHora;
		int horasTrabalhadas;
		char digitarOutro;

		do {

			System.out.print("Nome: ");
			nome = sc.next();

			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();

			while (horasTrabalhadas < 0) {
				System.out.print("O valor das horas trabalhadas n�o pode ser negativo. Horas trabalhadas: ");
				horasTrabalhadas = sc.nextInt();
			}

			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();

			while (valorHora < 0) {
				System.out.print("O valor por hora n�o pode ser negativo. Valor por hora: ");
				valorHora = sc.nextDouble();
			}

			System.out.print("Digitar outro (S/N)? ");
			digitarOutro = sc.next().charAt(0);

		} while (digitarOutro == 'S');

		// Menu
		
		int opcao;

		do {
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma op��o: ");

			opcao = sc.nextInt();

		} while (opcao != 4);

	}

}
