package br.com.projetoIGO.model.DAO;

import br.com.projetoIGO.model.Entidades.Cidade;
import br.com.projetoIGO.model.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
// tudo feito tambem
public class CidadeDAO {

    private Conexao conexao;

    public CidadeDAO() {
	this.conexao = new Conexao();
    }

    // C(salvar) R(listar/ler) U(Atualizar) D(Deletar) para todos
    public boolean salvar(Cidade cidade) {
	try {
	    String sql = "INSERT INTO CIDADE (nome_cidade, cod_estado) "
		    + " VALUES (?,?);";

	    PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
	    stm.setString(1, cidade.getNome_cidade());
	    stm.setInt(2, cidade.getCod_estado());

	    stm.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}

	return false;
    }

    public boolean atualizarCidade(Cidade cidade) {
	try {
	    String sql = "UPDATE CIDADE SET nome_cidade=?,cod_estado=?"
		    +"WHERE cod_cidade=? ";

	    PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
	    stm.setString(1, cidade.getNome_cidade());
	    stm.setInt(2, cidade.getCod_estado());
	    stm.setInt(3, cidade.getCod_cidade());

	    stm.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}

	return false;
    }

    public boolean apagarCidade(int cod_cidade) {
	try {
	    String sql = "delete from cidade where cod_cidade = ?";
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);

	    pst.setInt(1, cod_cidade);
	    pst.execute();
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return false;
    }

    public List<Cidade> listarCidades() {
	List<Cidade> listaDeCidade = new ArrayList<>();
	try {
	    String sql = "SELECT * FROM CIDADE";
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();

	    while (rs.next()) {
		Cidade cidade = new Cidade();
		cidade.setCod_cidade(rs.getInt("cod_cidade"));
		cidade.setCod_estado(rs.getInt("cod_estado"));
		cidade.setNome_cidade(rs.getString("nome_cidade"));
		listaDeCidade.add(cidade);
	    }
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return listaDeCidade;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return listaDeCidade;
    }
}
