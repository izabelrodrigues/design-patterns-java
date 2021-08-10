/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;


/**
 * @author Izabel Rodrigues
 *
 */
public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal calcular(Orcamento orcamento);
}
