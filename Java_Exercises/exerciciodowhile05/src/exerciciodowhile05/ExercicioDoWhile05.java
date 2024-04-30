/*Proposta:
DO WHILE - 05
Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
*/


package exerciciodowhile05;

import java.util.Scanner;

public class ExercicioDoWhile05 {

	 public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);

	        int numero;
	        int somaPositivos = 0;
	        
	        System.out.println("Entre com numeros inteiros (digite 0 para encerrar):");

	        do {
	            System.out.print("Digite um número: ");
	            numero = read.nextInt();

	            if (numero > 0) {
	                somaPositivos += numero;
	            }
	        } while (numero != 0);

	        System.out.println("A soma dos números positivos é: " + somaPositivos);

	        read.close();
	    }
	}