/**
 *
 */
package br.com.izabelrodrigues.loja.templatemethod;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class DescontoTemplatePadrao extends DescontoTemplate {

	public DescontoTemplatePadrao() {
		super(null);
	}

	@Override
	public BigDecimal obtemValorDesconto(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return true;
	}

}
