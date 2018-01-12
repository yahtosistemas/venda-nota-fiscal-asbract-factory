package com.algaworks.venda;

import com.algaworks.boleta.Boleta;
import com.algaworks.nfe.NFe;

public interface ModuloVendaFactory {

	public NFe criarNFe();
	public Boleta criarBoleta();
}
