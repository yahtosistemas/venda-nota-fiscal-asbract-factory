package com.algaworks.venda;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.model.builder.NFeBuilder;
import com.algaworks.venda.loja.LojaFactory;

public class LojaFactoryTest {

	private Venda venda;
	private NFeBuilder notaFiscalBuilder;
	
	@Before
	public void init() throws IOException {
		LojaFactory moduloEmissaoNotaFiscalFactory = new LojaFactory();
		venda = new Venda(moduloEmissaoNotaFiscalFactory);
		notaFiscalBuilder = new NFeBuilder(venda.getNFe());
	}
	
	@Test
	public void deveEmitirNotaFiscal() throws Exception {
		notaFiscalBuilder
			.comProduto("Feijão", 5, new BigDecimal("5.0"))
			.comProduto("Arroz", 2, new BigDecimal("3.5"));
		venda.realizar();
	}

}
