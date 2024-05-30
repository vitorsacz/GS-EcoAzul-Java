package br.com.fiap.menu;

import java.util.Scanner;

import br.com.fiap.beans.Contato;
import br.com.fiap.dao.ContatoDAO;
import br.com.fiap.exceptions.DatabaseException;

public class ContatoSelecionar {

	public Contato exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------CONTATO-----");
		System.out.println("====================\n");

		System.out.println("Informe o ID: ");
		String idContato = scanner.nextLine();

		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();

		System.out.println("Informe o seu Email: ");
		String email = scanner.nextLine();

		System.out.println("Informe o seu telefone: ");
		String telefone = scanner.nextLine();

		Contato contato = new Contato();

		contato.setIdContato(idContato);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);

		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			contato = contatoDAO.selecionar(idContato);
			if (contato != null) {
				System.out.println("Contato encontrado: \n" + contato.toString());
			} else {
				System.out.println("Contato não encontrado.");
			}
		} catch (ClassNotFoundException | DatabaseException e) {
			e.printStackTrace();
			System.out.println("ERRO AO SELECIONAR CONTATO: " + e.getMessage());
		}

		System.out.println("\n" + contato.toString());

		return contato;

	}
}
