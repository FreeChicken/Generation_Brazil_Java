/*Proposta:
FOR - 01
Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. 
Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
*/


package exerciciofor01;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2; 
		
		
		System.out.println("Digite o primeiro numero do intervalo:");
		num1 = read.nextInt(); 
		
		System.out.println("Digite o ultimo numero do intervalo:");
		num2 = read.nextInt(); 
		
		if (num1 > num2) {
			System.out.println("Intervalo invalido!\nO primeiro numero deve ser menor que o segundo.");
		} else {
            System.out.println("No Intervalo entre " + num1 + " e " + num2 + ":\n");

       
            	for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é multiplo de 3 e 5");
                }
            }
        }

        read.close();
    }
}
