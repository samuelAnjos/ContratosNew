package br.com.projetoIGO.model.DAO;

import br.com.projetoIGO.model.Entidades.Cidade;
import br.com.projetoIGO.model.conexao.Conexao;
import java.sql.PreparedStatement;

/**
 *
 * @author samuel
 */
public class CidadeDAO {

    private Conexao conexao;

    public CidadeDAO() {
	this.conexao = new Conexao();
    }

    // C(salvar) R(listar/ler) U(Atualizar) D(Deletar) para todos
    public boolean salvar(Cidade cidade) {
	try {
	    String sql = "insert into cidade (nome_cidade, cod_estado) values (?,?);";
	 
	    PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    pst.setString(1, cidade.getNome_cidade());
	    pst.setInt(2, cidade.getCod_estado());
	    
	    pst.execute();
	    //depois vou // nesses 2 abaixo para testar
	    conexao.getConexao().commit();
	    conexao.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return false;
    }
    
    // now read list
}
