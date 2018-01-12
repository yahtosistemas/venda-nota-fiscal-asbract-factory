package com.algaworks.model.builder;

import java.math.BigDecimal;

import com.algaworks.model.NFeAbstract;
import com.algaworks.model.Produto;
import com.algaworks.nfe.NFe;

public class NFeBuilder {

	private NFeAbstract notaFiscal;
	
	public NFeBuilder(NFe notaFiscal) {
		this.notaFiscal = (NFeAbstract) notaFiscal;
	}
	
	public NFeBuilder comProduto(String nome, Integer quantidade, BigDecimal valorUnitario) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValorUnitario(valorUnitario);
		this.notaFiscal.getProdutos().add(produto);
		
		return this;
	}
}
