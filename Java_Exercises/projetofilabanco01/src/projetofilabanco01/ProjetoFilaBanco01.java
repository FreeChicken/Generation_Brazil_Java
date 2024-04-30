/*Proposta:
QUEUE - 01
Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, 
para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
*/


package projetofilabanco01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProjetoFilaBanco01 {

	public static void main(String[] args) {
		executar();
	}

	public static void exibirMenu() {
		System.out.println("*****************************************************");
		System.out.println("               FILA DO BANCO	                     ");
		System.out.println("*****************************************************");
		System.out.println("            1 - Adicionar Cliente na Fila            ");
		System.out.println("            2 - Listar todos os Clientes             ");
		System.out.println("            3 - Retirar Cliente da Fila              ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
	}

	public static void executar() {
		Queue<String> filaClientes = new LinkedList<>();
		Scanner read = new Scanner(System.in);
		int opcao;

		while (true) {
			exibirMenu();
			opcao = read.nextInt();
			read.nextLine();

			switch (opcao) {
			case 1:
				adicionarCliente(filaClientes, read);
				break;
			case 2:
				listarClientes(filaClientes);
				break;
			case 3:
				retirarCliente(filaClientes);
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

			System.out.println("\nClientes na Fila:" + filaClientes);
		}
	}

	public static void adicionarCliente(Queue<String> filaClientes, Scanner read) {
		System.out.println("Insira o nome do Cliente:");
		String nomeCliente = read.nextLine();
		filaClientes.offer(nomeCliente);
		System.out.println("Cliente Adicionado!");
	}

	public static void listarClientes(Queue<String> filaClientes) {
		System.out.println("Lista de Clientes na Fila:");
		if (filaClientes.isEmpty()) {
			System.out.println("A Fila está vazia!\n");
		} else {
			for (String cliente : filaClientes) {
				System.out.println(cliente);
			}
			System.out.println();
		}
	}

	public static void retirarCliente(Queue<String> filaClientes) {
		if (!filaClientes.isEmpty()) {
			String clienteRetirado = filaClientes.poll();
			System.out.println("Cliente " + clienteRetirado + " foi chamado(a)!\n");
		} else {
			System.out.println("A Fila está vazia!\n");
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Anderson Alves ");
		System.out.println("*********************************************************");
	}
}
