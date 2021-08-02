/**
 *
 */
package br.com.izabelrodrigues.loja.templatemethod;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public abstract class DescontoTemplate {

	protected DescontoTemplate proximo;

	public DescontoTemplate(DescontoTemplate proximo) {
		this.proximo = proximo;
	}

	protected BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicarDesconto(orcamento)) {
			return obtemValorDesconto(orcamento);
		}
		return proximo.obtemValorDesconto(orcamento);
	}

	protected abstract BigDecimal obtemValorDesconto(Orcamento orcamento);

	protected abstract boolean deveAplicarDesconto(Orcamento orcamento);
}
