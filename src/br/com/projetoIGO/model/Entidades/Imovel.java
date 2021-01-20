
package br.com.projetoIGO.model.Entidades;

/**
 *
 * @author samue
 */
public class Imovel {
    private int cod_imovel;
    private String logradouro_imovel;
    private String bairro_imovel;
    private int num_imovel;
    private String cep_imovel;
    private int cod_cidade;
    private double valor_imovel;
    private int cod_locador;

    public Imovel() {
    }

    public Imovel(int cod_imovel, String logradouro_imovel, String bairro_imovel, int num_imovel, String cep_imovel, int cod_cidade, double valor_imovel, int cod_locador) {
	this.cod_imovel = cod_imovel;
	this.logradouro_imovel = logradouro_imovel;
	this.bairro_imovel = bairro_imovel;
	this.num_imovel = num_imovel;
	this.cep_imovel = cep_imovel;
	this.cod_cidade = cod_cidade;
	this.valor_imovel = valor_imovel;
	this.cod_locador = cod_locador;
    }
    
    

    public int getCod_imovel() {
	return cod_imovel;
    }

    public void setCod_imovel(int cod_imovel) {
	this.cod_imovel = cod_imovel;
    }

    public String getLogradouro_imovel() {
	return logradouro_imovel;
    }

    public void setLogradouro_imovel(String logradouro_imovel) {
	this.logradouro_imovel = logradouro_imovel;
    }

    public String getBairro_imovel() {
	return bairro_imovel;
    }

    public void setBairro_imovel(String bairro_imovel) {
	this.bairro_imovel = bairro_imovel;
    }

    public int getNum_imovel() {
	return num_imovel;
    }

    public void setNum_imovel(int num_imovel) {
	this.num_imovel = num_imovel;
    }

    public String getCep_imovel() {
	return cep_imovel;
    }

    public void setCep_imovel(String cep_imovel) {
	this.cep_imovel = cep_imovel;
    }

    public int getCod_cidade() {
	return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
	this.cod_cidade = cod_cidade;
    }

    public double getValor_imovel() {
	return valor_imovel;
    }

    public void setValor_imovel(double valor_imovel) {
	this.valor_imovel = valor_imovel;
    }

    public int getCod_locador() {
	return cod_locador;
    }

    public void setCod_locador(int cod_locador) {
	this.cod_locador = cod_locador;
    }
    
    
}
