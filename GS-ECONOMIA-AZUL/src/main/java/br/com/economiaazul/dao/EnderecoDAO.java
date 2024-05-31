package br.com.economiaazul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.economiaazul.conexao.ConnectFactory;
import br.com.economiaazul.exceptions.EnderecoDatabase;
import br.com.economiaazul.model.Endereco;

public class EnderecoDAO {
    
    public Connection minhaConexao;
    
    public EnderecoDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConnectFactory().conexao(); 
    }
    
    public String inserir(Endereco endereco) throws EnderecoDatabase {
        PreparedStatement stmt;
        try {
            stmt = minhaConexao.prepareStatement(
                    "INSERT INTO t_gs_endereco(idEndereco, cep, lougradouro, complemento, bairro, localidade, uf) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1, endereco.getIdEndereco());
            stmt.setString(2, endereco.getCep());
            stmt.setString(3, endereco.getLougradouro());
            stmt.setString(4, endereco.getComplemento());
            stmt.setString(5, endereco.getBairro());
            stmt.setString(6, endereco.getLocalidade());
            stmt.setString(7, endereco.getUf());
            stmt.execute();
            stmt.close();

            return "\nCadastrado com Sucesso";
        } catch (SQLException e) {
            throw new EnderecoDatabase("Erro no cadastro", e);
        }
    }
}
