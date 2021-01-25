
package br.com.projetoIGO.model.Entidades;

/**
 *
 * @author samue
 */
public class Estado {
    private int cod_estado;
    private String nome_estado;

    public Estado() {
    }

    public Estado(int cod_estado, String nome_estado) {
	this.cod_estado = cod_estado;
	this.nome_estado = nome_estado;
    }
    
    

    public int getCod_estado() {
	return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
	this.cod_estado = cod_estado;
    }

    public String getNome_estado() {
	return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
	this.nome_estado = nome_estado;
    }

    @Override
    public String toString() {
	return nome_estado;
    }
    
    
}
