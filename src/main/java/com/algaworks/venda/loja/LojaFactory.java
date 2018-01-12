package com.algaworks.venda.loja;

import java.io.IOException;
import java.util.Properties;

import com.algaworks.boleta.Boleta;
import com.algaworks.nfe.ErroAoCriarNotaFiscalException;
import com.algaworks.nfe.NFe;
import com.algaworks.venda.ModuloVendaFactory;

public class LojaFactory implements ModuloVendaFactory {

	private Properties prop;
	
	public LojaFactory() throws IOException {
		this.prop = new Properties();
		prop.load(this.getClass().getResourceAsStream("/config.properties"));
	}
	
	@Override
	public NFe criarNFe() {
		try {
			NFe nfe = (NFe) Class.forName(this.prop.getProperty("nfe")).newInstance();
			return nfe;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ErroAoCriarNotaFiscalException("Erro ao recuperar instancia de nota fiscal");
		}
	}

	@Override
	public Boleta criarBoleta() {
		try {
			Boleta boleta = (Boleta) Class.forName(this.prop.getProperty("boleta")).newInstance();
			return boleta;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ErroAoCriarNotaFiscalException("Erro ao recuperar instancia de boleto");
		}
	}
}
