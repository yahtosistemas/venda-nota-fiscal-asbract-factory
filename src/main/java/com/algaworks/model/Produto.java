package com.algaworks.model;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private Integer quantidade;
	private BigDecimal valorUnitario;
	private BigDecimal valorImposto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public BigDecimal getValorImposto() {
		return valorImposto;
	}
	public void setValorImposto(BigDecimal valorImposto) {
		this.valorImposto = valorImposto;
	}
	
	public BigDecimal getValorTotalSemImpostos() {
		return valorUnitario.multiply(new BigDecimal(quantidade));
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario
				+ ", valorTotalSemImposto=" + getValorTotalSemImpostos() + ", valorComImposto=" + valorImposto + "]";
	}
}
