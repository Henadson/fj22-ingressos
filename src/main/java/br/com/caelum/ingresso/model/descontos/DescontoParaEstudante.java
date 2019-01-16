package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaEstudante implements Desconto {

	@Override
	public BigDecimal aplicarDescontosobre(BigDecimal precoOriginal) {
		
		return precoOriginal.divide(new BigDecimal("2.0"));
	}
	
	@Override
	public String getDescricao() {
		return "Desconto Estudante";
	}

}
