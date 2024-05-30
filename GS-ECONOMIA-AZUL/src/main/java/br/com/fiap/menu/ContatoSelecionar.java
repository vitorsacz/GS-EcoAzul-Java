package br.com.fiap.menu;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.fiap.beans.Contato;
import br.com.fiap.dao.ContatoDAO;

public class ContatoSelecionar {
	
public Contato exibirMenu() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n====================");
		System.out.println("-------CONTATO-----");
		System.out.println("====================\n");
		
		
		System.out.println("Informe o ID: ");
		String idCOntato = scanner.nextLine();
		
		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o seu Email: ");
		String email = scanner.nextLine();
		
		
		System.out.println("Informe o seu telefone: ");
		String telefone = scanner.nextLine();
		
		
		Contato contato = new Contato();
		
		
		contato.setIdContato(idCOntato);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		
		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.inserir(contato);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("ERRO AO SELECIONAR CONTATO");
		}

		
		System.out.println("\n" + contato.toString());
		
		return contato;
		
	}
}
