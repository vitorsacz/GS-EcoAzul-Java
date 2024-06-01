package br.com.economiaazul.bo;

import java.sql.SQLException;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.dao.OngDAO;

public class OngBO {
	
	 private OngDAO ongDAO;
	 
	 public OngBO() throws ClassNotFoundException, SQLException {
	        this.ongDAO = new OngDAO();
	    }
	 
	 public void inserirBO(Ong ong) throws Exception  {
		 ongDAO.inserir(ong);
	 }
	
}
