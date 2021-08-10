/**
 *
 */
package br.com.izabelrodrigues.loja.decorator;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public abstract class Imposto {

	protected Imposto impostoAdicional;

	public Imposto(Imposto impostoAdicional) {
		this.impostoAdicional = impostoAdicional;
	}

	protected abstract BigDecimal calcular(Orcamento orcamento);

	BigDecimal efetuaCalculoImpostoTotal(Orcamento orcamento) {

		BigDecimal valorImposto = calcular(orcamento);

		if (null != impostoAdicional) {
			return valorImposto.add(impostoAdicional.calcular(orcamento));
		}
		return valorImposto;
	}
}
