package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.beans.Contato;
import br.com.fiap.conexao.ConnectFactory;

public class ContatoDAO {

	public Connection minhaConexao;

	public ContatoDAO() throws ClassNotFoundException, SQLException  {
		super();
		this.minhaConexao = new ConnectFactory().conexao() ;
	}
	
	
	public String inserir(Contato contato)  {
		PreparedStatement statement;
		try {
			statement = minhaConexao.prepareStatement("insert into t_gs_contato(idContato, nome, email, telefone) "
					+ "values (?, ?, ?, ?)");
			
			statement.setString(1, contato.getIdContato());
			statement.setString(2, contato.getNome());
			statement.setString(3, contato.getEmail());
			statement.setString(4, contato.getTelefone());
			statement.execute();
			statement.close();
			
		} catch (SQLException e) {
		    System.out.println("Erro no cadastro");
			e.printStackTrace();
		}
	

		return "Cadastrado com Sucesso";
	}
	
	
	public String deletar(Contato contato) {
	    PreparedStatement statement;
	    try {
	        statement = minhaConexao.prepareStatement("delete from t_gs_contato where idContato = ?");
	        statement.setString(1, contato.getIdContato());
	        int rowsDeleted = statement.executeUpdate();
	        if (rowsDeleted > 0) {
	            return "Contato deletado com sucesso";
	        } else {
	            return "Contato não encontrado";
	        }
	    } catch (SQLException e) {
	        System.out.println("Erro ao deletar contato");
	        e.printStackTrace();
	        return "Erro ao deletar contato";
	    }
	}
	
	
	public String alterar(Contato contato) {
	    PreparedStatement statement;
	    try {
	        statement = minhaConexao.prepareStatement("update t_gs_contato set nome = ?, email = ?, telefone = ? where idContato = ?");
	        
	        statement.setString(1, contato.getNome());
	        statement.setString(2, contato.getEmail());
	        statement.setString(3, contato.getTelefone());
	        statement.setString(4, contato.getIdContato());
	        
	        int rowsUpdated = statement.executeUpdate();
	        
	        if (rowsUpdated > 0) {
	            return "Contato atualizado com sucesso";
	        } else {
	            return "Contato não encontrado";
	        }
	        
	    } catch (SQLException e) {
	        System.out.println("Erro ao atualizar contato");
	        
	        e.printStackTrace();
	        
	        return "Erro ao atualizar contato";
	    }
	}
	
	
	public Contato selecionar(String idContato) {
	    PreparedStatement statement;
	    ResultSet resultSet;
	    try {
	        statement = minhaConexao.prepareStatement("select * from t_gs_contato where idContato = ?");
	        
	        statement.setString(1, idContato);
	        
	        resultSet = statement.executeQuery();
	        
	        if (resultSet.next()) {
	            Contato contato = new Contato();
	            
	            contato.setIdContato(resultSet.getString("idContato"));
	            contato.setNome(resultSet.getString("nome"));
	            contato.setEmail(resultSet.getString("email"));
	            contato.setTelefone(resultSet.getString("telefone"));
	            
	            return contato;
	            
	        } else {
	            return null; 
	        }
	    } catch (SQLException e) {
	        System.out.println("Erro ao selecionar contato");
			e.printStackTrace();
	        return null;
	    }
	}




}
