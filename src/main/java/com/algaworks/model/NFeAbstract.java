package com.algaworks.model;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.nfe.NFe;

public abstract class NFeAbstract implements NFe {

	private Long codigoConfirmacao = -1L;
	private String numero;
	private List<Produto> produtos = new ArrayList<>();
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Long getCodigoConfirmacao() {
		return codigoConfirmacao;
	}
	public void setCodigoConfirmacao(Long codigoConfirmacao) {
		this.codigoConfirmacao = codigoConfirmacao;
	}
	
	protected abstract void calcularValorDoImposto();
}
