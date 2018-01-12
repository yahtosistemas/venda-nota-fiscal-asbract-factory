package com.algaworks.venda;

import com.algaworks.boleta.Boleta;
import com.algaworks.nfe.NFe;

public class Venda {

	private NFe notaFiscal;
	private Boleta boleta;
	
	public Venda(ModuloVendaFactory moduloEmissaoNotaFiscalFactory) {
		this.notaFiscal = moduloEmissaoNotaFiscalFactory.criarNFe();
		this.boleta = moduloEmissaoNotaFiscalFactory.criarBoleta();
	}
	
	public void realizar() {
		this.notaFiscal.gerar();
		this.boleta.emitir(getNFe());
	}
	
	public NFe getNFe() {
		return this.notaFiscal;
	}
}
