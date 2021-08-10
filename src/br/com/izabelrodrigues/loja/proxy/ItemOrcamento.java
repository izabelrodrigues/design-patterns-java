/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;

/**
 * @author Izabel Rodrigues
 *
 */
public class ItemOrcamento implements Orcavel {

	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	@Override
	public BigDecimal getValor() {
		return valor;
	}

}
