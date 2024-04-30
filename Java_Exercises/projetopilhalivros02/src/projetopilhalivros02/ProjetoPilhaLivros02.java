/*Proposta:
STACK - 02
Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha.
O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
*/


package projetopilhalivros02;

import java.util.Scanner;
import java.util.Stack;

public class ProjetoPilhaLivros02 {

	public static void main(String[] args) {
		executar();
	}
	 public static void exibirMenu() {
		System.out.println("*****************************************************");
		System.out.println("                PILHA DE LIVROS                      ");
		System.out.println("*****************************************************");
		System.out.println("            1 - Adicionar Livro na Pilha             ");
		System.out.println("            2 - Listar todos os Livros da Pilha      ");
		System.out.println("            3 - Retirar Livro da Pilha               ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                        ");
		}
		
	public static void executar() {
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner read = new Scanner(System.in);
		int opcao;

		while (true) {
			exibirMenu();
			opcao = read.nextInt();
			read.nextLine();
			switch (opcao) {
			case 1:
				adicionarLivro(pilhaLivros, read);
				break;
			case 2:
				listarLivros(pilhaLivros);
				break;
			case 3:
				retirarLivro(pilhaLivros);
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				sobre();
				System.exit(0);
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
			System.out.println("\nLivros na Pilha:" + pilhaLivros);

		}
	}
	
	

	public static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
		System.out.println("Insira o nome do Livro:");
		String nomeLivro = scanner.nextLine();
		pilhaLivros.push(nomeLivro);
		System.out.println("Livro Adicionado!");
	}

	public static void listarLivros(Stack<String> pilhaLivros) {
		System.out.println("Lista de Livros na Pilha:");
		if (pilhaLivros.isEmpty()) {
			System.out.println("A Pilha está vazia!\n");
		} else {
			for (String livro : pilhaLivros) {
				System.out.println(livro);
			}
			System.out.println();
		}
	}

	public static void retirarLivro(Stack<String> pilhaLivros) {
		if (!pilhaLivros.isEmpty()) {
			String livroRetirado = pilhaLivros.pop();
			System.out.println("Livro " + livroRetirado + " foi retirado da pilha!\n");
		} else {
			System.out.println("A Pilha está vazia!\n");
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Anderson Alves ");
		System.out.println("*********************************************************");
	}
}
