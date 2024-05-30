package br.com.fiap.menu;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.fiap.beans.Contato;
import br.com.fiap.dao.ContatoDAO;

public class ContatoDeletar {

	public Contato exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------CONTATO-----");
		System.out.println("====================\n");

		System.out.println("Informe o id para deletar: ");
		
		String id = scanner.nextLine();
		
		
		Contato contato = new Contato();
		
		contato.setIdContato(id);
		
		
		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.deletar(contato);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("ERRO A O DELETAR INFORMAÇÕES");
		}

		System.out.println("\n" + contato.getIdContato() + "\n INFORMAÇÕES DELETADA");
		
		return contato;
	}
}
