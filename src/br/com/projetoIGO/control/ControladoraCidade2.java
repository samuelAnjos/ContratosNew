package br.com.projetoIGO.control;

import br.com.projetoIGO.model.DAO.CidadeDAO;
import br.com.projetoIGO.model.DAO.EstadoDAO;
import br.com.projetoIGO.model.Entidades.Cidade;
import br.com.projetoIGO.model.Entidades.Estado;
import br.com.projetoIGO.model.conexao.Conexao;
import java.util.List;

/**
 *
 * @author samuel
 */
public class ControladoraCidade2 {

    CidadeDAO cdao;
    EstadoDAO edao;

    public ControladoraCidade2() {
	    cdao = new CidadeDAO();
            edao = new EstadoDAO();
    }

    public List<Cidade> carregarCidades() {
	return cdao.listarCidades();
    }

    public List<Estado> ListarEstado() {
	return edao.ListarEstado();
    }
}
