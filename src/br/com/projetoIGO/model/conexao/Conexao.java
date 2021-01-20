
package br.com.projetoIGO.model.conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author samue
 */
public class Conexao {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbd:mysql://localhost:3306/bancocontratosnovo";
    private final String user = "root";
    private final String password = "ovelhapreta";
    
   private Connection conexao = null;
    
    //um contrutor
    public Conexao(){
	try {
	    Class.forName(driver);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    // getConexao
    public Connection getConexao(){ 
        if(conexao==null){
	    try {
		conexao = (Connection) DriverManager.getConnection(url, user, password);
		conexao.setAutoCommit(false);
		
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return conexao;
    }
    
    public void desconecta(){
      try {
	    conexao.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
      conexao = null;
    }
    
}
