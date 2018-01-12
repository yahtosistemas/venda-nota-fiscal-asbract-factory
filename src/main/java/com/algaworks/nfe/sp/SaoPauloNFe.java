package com.algaworks.nfe.sp;

import java.math.BigDecimal;

import com.algaworks.model.NFeAbstract;

public class SaoPauloNFe extends NFeAbstract {

	private final BigDecimal valorImposto = new BigDecimal("1.10");

	@Override
	public void gerar() {
		calcularValorDoImposto();
	}

	@Override
	public void calcularValorDoImposto() {
		getProdutos().forEach(p -> p.setValorImposto(p.getValorTotalSemImpostos().multiply(valorImposto)));
	}
}
