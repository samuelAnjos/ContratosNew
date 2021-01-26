package br.com.projetoIGO.model.DAO;

import br.com.projetoIGO.model.Entidades.Estado;
import br.com.projetoIGO.model.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
//tudo feito graças a Deus
public class EstadoDAO {

    private Conexao conexao;

    public EstadoDAO() {
	this.conexao = new Conexao();
    }

    public boolean salvar(Estado estado) {
	// estado
	try {
	    String sql = "insert into estado (nome_estado) values  (?);";

	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setString(1, estado.getNome_estado());
	    pst.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return false;

    }

    private boolean atualizarEstado(Estado estado) {
	try {
	    String sql = "update estado set nome_estado = ?  where cod_estado =?";

	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setString(1, estado.getNome_estado());
	    pst.setInt(2, estado.getCod_estado());
	    pst.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}

	return false;
    }

    public boolean apagarEstado(int cod_estado) {
	try {
	    String sql = "delete from estado where cod_estado = ?";
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setInt(1, cod_estado);

	    pst.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return false;

    }

    public List<Estado> ListarEstado() {
	List<Estado> listaEstados = new ArrayList<>();
	try {
	    String sql = "select * from estado";
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();

	    while (rs.next()) {
		Estado estado = new Estado();
		estado.setCod_estado(rs.getInt("cod_estado"));
		estado.setNome_estado(rs.getString("nome_estado"));
		listaEstados.add(estado);
	    }
	    conexao.desconecta();
	    return listaEstados;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return listaEstados;

    }
    
    public Estado buscarEstadoPeloCodigo(int cod_estado){
	Estado estado = new Estado();
	try {
	    String sql = "select * from estado where cod_estado = ?";
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setInt(1, cod_estado);
	    ResultSet rs = pst.executeQuery();
	    
	    while(rs.next()){
		
	        estado.setCod_estado(rs.getInt("cod_estado"));
		estado.setNome_estado(rs.getString("nome_estado"));
	    }
	    conexao.desconecta();
	    return estado;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	
	return estado;
    }

    public int buscarEstPeloNome(String nome_estado) {
	int codigo = 0;
	try {
	    String sql = "select * from estado where nome_estado = ?";
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setString(1, nome_estado);
	    ResultSet rs = pst.executeQuery();
	    
	    while(rs.next()){
		
	    //codigo = rs.getInt("cod_estado"));
		codigo=rs.getInt("cod_estado");
	    }
	    conexao.desconecta();
	    return codigo;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	
	return codigo;
    }

    

    

}
