/**
 *
 */
package br.com.izabelrodrigues.loja.chainresponsibility;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class DescontoPadrao extends Desconto {

	public DescontoPadrao() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
