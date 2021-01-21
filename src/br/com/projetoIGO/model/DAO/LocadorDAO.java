package br.com.projetoIGO.model.DAO;

import br.com.projetoIGO.model.Entidades.Locador;
import br.com.projetoIGO.model.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author samuel
 */
public class LocadorDAO {

    private Conexao conexao;

    public LocadorDAO() {
	this.conexao = new Conexao();
    }

  

    public boolean salvarLocador(Locador locador) {
	
	try {
	    String sql = " insert into locador(nome_locador,sexo_locador,profissao_locador,estado_civil_locador,rg_locador,cpf_locador,endereco_locador,num_end_locador,cep_end_locador,cod_cidade,senha) ";

	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setString(1, locador.getNome_locador());
	    pst.setString(2, locador.getSexo_locador());
	    pst.setString(3, locador.getProfissao_locador());
	    pst.setString(4, locador.getEstado_civil_locador());
	    pst.setInt(5, locador.getRg_locador());
	    pst.setLong(6, locador.getCpf_locador());
	    pst.setString(7, locador.getEndereco_locador());
	    pst.setInt(8, locador.getNum_end_locador());
	    pst.setString(9, locador.getCep_end_locador());
	    pst.setInt(10, locador.getCod_cidade());
	    pst.setString(11, locador.getSenha());

	    pst.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return false;
    }

    public boolean verificarAcesso(String cpf, String senha) {
	try {
	    String sql = "SELECT 1 FROM LOCADOR "
		    + "WHERE cpf_locador = ? "
		    + "and   senha = ?  ";

	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setString(1, cpf);
	    pst.setString(2, senha);
	    ResultSet rs = pst.executeQuery();

	    while (rs.next()) {
		conexao.desconecta();
		return true;
	    }
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	conexao.desconecta();
	return false;
    }
}
