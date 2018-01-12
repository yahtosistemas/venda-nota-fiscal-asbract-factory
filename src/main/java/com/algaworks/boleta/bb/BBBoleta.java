package com.algaworks.boleta.bb;

import com.algaworks.boleta.Boleta;
import com.algaworks.model.NFeAbstract;
import com.algaworks.nfe.NFe;

public class BBBoleta implements Boleta {

	@Override
	public void emitir(NFe nfe) {
		((NFeAbstract) nfe).getProdutos().forEach(System.out::println);
	}

}
