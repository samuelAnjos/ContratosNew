/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIGO.model.Entidades;

/**
 *
 * @author samue
 */
public class Cidade {

    private int cod_cidade;
    private String nome_cidade;
    private int cod_estado;

    public Cidade() {
    }

    public Cidade(int cod_cidade, String nome_cidade, int cod_estado) {
	this.cod_cidade = cod_cidade;
	this.nome_cidade = nome_cidade;
	this.cod_estado = cod_estado;
    }
    
    

    public int getCod_cidade() {
	return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
	this.cod_cidade = cod_cidade;
    }

    public String getNome_cidade() {
	return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
	this.nome_cidade = nome_cidade;
    }

    public int getCod_estado() {
	return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
	this.cod_estado = cod_estado;
    }
    
    
}
