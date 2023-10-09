package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Data;
import entities.Voo;

public class Program {

	public static void main(String[] args) {
		// Código para resolucao do exercicio cinco
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o dia que voo vai ser realizado: ");
		int dia = sc.nextInt();
		System.out.print("Entre com o mes que voo vai ser realizado: ");
		int mes = sc.nextInt();
		System.out.print("Entre com o ano que voo vai ser realizado: ");
		int ano = sc.nextInt();

		Data dataOperacao = new Data(dia, mes, ano);
		System.out.println("A viagem ocorrerá em: " + dataOperacao.toString());

		System.out.print("\nEntre agora com a quantidade de assentos que o avião terá: ");
		int quantidadeAssentos = sc.nextInt();
		Voo voo = new Voo(dataOperacao, quantidadeAssentos);

		for (int i = 0; i < quantidadeAssentos; i++) {
			double random = Math.random();
			if (random < 0.5) {
				voo.ocupa(i + 1);
			}
		}

		System.out.println("\nSobre o voo: ");
		voo.imprimir();
		System.out.println("\nO voo está lotado? " + voo.lotado());

		sc.close();
	}

}
