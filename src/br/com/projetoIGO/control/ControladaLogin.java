
package br.com.projetoIGO.control;

import br.com.projetoIGO.model.DAO.LocadorDAO;


/**
 *
 * @author samuel
 */
public class ControladaLogin {
    private LocadorDAO dao;

    public ControladaLogin() {
	dao = new LocadorDAO();
    }
    
    public boolean verificarAcesso(String cpf, String senha){
       return dao.verificarAcesso(cpf, senha);
    }
}
