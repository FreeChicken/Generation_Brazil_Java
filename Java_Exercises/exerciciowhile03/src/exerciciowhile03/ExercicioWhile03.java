/*Proposta:
WHILE - 03
Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. 
A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:
*/


package exerciciowhile03;

import java.util.Scanner;

public class ExercicioWhile03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int idade;
		int totalMenoresDe21 = 0;
		int totalMaioresDe50 = 0;

		System.out.println("Entre com as idades das pessoas (digite uma idade negativa para encerrar):");

		while (true) {
			System.out.print("Digite uma idade: ");
			idade = read.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				totalMenoresDe21++;
			} else if (idade > 50) {
				totalMaioresDe50++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + totalMenoresDe21 +"\n");
		System.out.println("Total de pessoas maiores de 50 anos: " + totalMaioresDe50);

		read.close();
	}
}
