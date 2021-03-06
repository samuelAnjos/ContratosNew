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

    public Estado buscarEstadoPeloCodigo(int cod_estado) {
	return edao.buscarEstadoPeloCodigo(cod_estado);
    }

    public boolean salvarCidade(Cidade cidade) {
	return cdao.salvar(cidade);
    }
    
    public int buscaEstadoPeloNome(String nome_estado) {
	return edao.buscarEstPeloNome(nome_estado);
    }
    
    public boolean atualizarCidade(Cidade cidade) {
	return cdao.atualizarCidade(cidade);
    }
    
    public boolean excluirCadastro(int cod_cidade){
	return cdao.apagarCidade(cod_cidade);
    }
}
