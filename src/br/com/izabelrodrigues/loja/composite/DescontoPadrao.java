/**
 *
 */
package br.com.izabelrodrigues.loja.composite;

import java.math.BigDecimal;


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
		System.out.println("Aplicando desconto padr?o de zero ...");
		return BigDecimal.ZERO;
	}

}
