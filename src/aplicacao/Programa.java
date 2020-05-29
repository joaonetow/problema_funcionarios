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
				System.out.print("O valor das horas trabalhadas não pode ser negativo. Horas trabalhadas: ");
				horasTrabalhadas = sc.nextInt();
			}

			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();

			while (valorHora < 0) {
				System.out.print("O valor por hora não pode ser negativo. Valor por hora: ");
				valorHora = sc.nextDouble();
			}

			System.out.print("Digitar outro (S/N)? ");
			digitarOutro = sc.next().charAt(0);

		} while (digitarOutro == 'S');

	}

}
