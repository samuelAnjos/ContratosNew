
package br.com.projetoIGO.model.conexao;


import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author samue
 */
public class Conexao {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/bancocontratosnovo";
    private java.sql.Connection conexao = null;
    String password = "ovelhapreta";
    String user = "root";

    public Conexao() {
	try {
	    Class.forName(driver);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public java.sql.Connection getConexao() {
	if (conexao == null) {
	    try {
		conexao = DriverManager.getConnection(url, user, password);
		conexao.setAutoCommit(false);
	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}
	return conexao;
    }

    public void desconecta() {
	try {
	    conexao.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	conexao = null;
    }
    
}
