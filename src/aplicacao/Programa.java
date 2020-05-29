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

		int totalHorasTrabalhadas = 0;
		double custoTotal = 0.0;

		double custoPorPessoa, maiorCusto = 0;
		String nomePessoaGanhouMais = "";

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

			custoPorPessoa = valorHora * horasTrabalhadas;

			// Total horas trabalhadas

			totalHorasTrabalhadas = totalHorasTrabalhadas + horasTrabalhadas;

			// Custo Total

			custoTotal = custoTotal + custoPorPessoa;

			if (custoPorPessoa > maiorCusto) {

				nomePessoaGanhouMais = nome;
				maiorCusto = custoPorPessoa;

			}

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
			System.out.print("Digite uma opção: ");

			opcao = sc.nextInt();

			System.out.println();

			if (opcao == 1) {

				System.out.printf("Total de horas = %d%n", totalHorasTrabalhadas);

			} else if (opcao == 2) {

				System.out.printf("Custo Total = R$ %.2f%n", custoTotal);

			} else if (opcao == 3) {

				System.out.printf("Pessoa que ganhou mais: %s%n", nomePessoaGanhouMais);

			} else if (opcao == 4) {

				System.out.println("FIM DO PROGRAMA!");

			}

		} while (opcao != 4);

	}

}
