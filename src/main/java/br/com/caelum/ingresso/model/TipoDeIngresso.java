package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;
import br.com.caelum.ingresso.model.descontos.DescontoParaBancos;
import br.com.caelum.ingresso.model.descontos.SemDesconto;
import br.com.caelum.ingresso.model.descontos.DescontoParaEstudante;

public enum TipoDeIngresso {
  INTEIRO(new SemDesconto()),
  ESTUDANTE(new DescontoParaEstudante()),
  BANCO(new DescontoParaBancos());
	
	private final Desconto desconto;
	
	private TipoDeIngresso(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public BigDecimal aplicaDesconto(BigDecimal valor) {
		return desconto.aplicarDescontosobre(valor);
	}
	
	public String getDescricao() {
		return desconto.getDescricao();
	}
}
