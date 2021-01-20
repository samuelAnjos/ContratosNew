
package br.com.projetoIGO.model.Entidades;

/**
 *
 * @author samue
 */
public class Locador {
    private int cod_locador;
    private String nome_locador;
    private String sexo_locador;
    private String profissao_locador;
    private String estado_civil_locador;
    private int rg_locador;
    private long cpf_locador;
    private String endereco_locador;
    private int num_end_locador;
    private String cep_end_locador;
    private int cod_cidade;
    private String senha;

    public Locador() {
    }

    public Locador(int cod_locador, String nome_locador, String sexo_locador, String profissao_locador, String estado_civil_locador, int rg_locador, long cpf_locador, String endereco_locador, int num_end_locador, String cep_end_locador, int cod_cidade, String senha) {
	this.cod_locador = cod_locador;
	this.nome_locador = nome_locador;
	this.sexo_locador = sexo_locador;
	this.profissao_locador = profissao_locador;
	this.estado_civil_locador = estado_civil_locador;
	this.rg_locador = rg_locador;
	this.cpf_locador = cpf_locador;
	this.endereco_locador = endereco_locador;
	this.num_end_locador = num_end_locador;
	this.cep_end_locador = cep_end_locador;
	this.cod_cidade = cod_cidade;
	this.senha = senha;
    }
    
    

    public int getCod_locador() {
	return cod_locador;
    }

    public void setCod_locador(int cod_locador) {
	this.cod_locador = cod_locador;
    }

    public String getNome_locador() {
	return nome_locador;
    }

    public void setNome_locador(String nome_locador) {
	this.nome_locador = nome_locador;
    }

    public String getSexo_locador() {
	return sexo_locador;
    }

    public void setSexo_locador(String sexo_locador) {
	this.sexo_locador = sexo_locador;
    }

    public String getProfissao_locador() {
	return profissao_locador;
    }

    public void setProfissao_locador(String profissao_locador) {
	this.profissao_locador = profissao_locador;
    }

    public String getEstado_civil_locador() {
	return estado_civil_locador;
    }

    public void setEstado_civil_locador(String estado_civil_locador) {
	this.estado_civil_locador = estado_civil_locador;
    }

    public int getRg_locador() {
	return rg_locador;
    }

    public void setRg_locador(int rg_locador) {
	this.rg_locador = rg_locador;
    }

    public long getCpf_locador() {
	return cpf_locador;
    }

    public void setCpf_locador(long cpf_locador) {
	this.cpf_locador = cpf_locador;
    }

    public String getEndereco_locador() {
	return endereco_locador;
    }

    public void setEndereco_locador(String endereco_locador) {
	this.endereco_locador = endereco_locador;
    }

    public int getNum_end_locador() {
	return num_end_locador;
    }

    public void setNum_end_locador(int num_end_locador) {
	this.num_end_locador = num_end_locador;
    }

    public String getCep_end_locador() {
	return cep_end_locador;
    }

    public void setCep_end_locador(String cep_end_locador) {
	this.cep_end_locador = cep_end_locador;
    }

    public int getCod_cidade() {
	return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
	this.cod_cidade = cod_cidade;
    }

    public String getSenha() {
	return senha;
    }

    public void setSenha(String senha) {
	this.senha = senha;
    }
    
    
}
