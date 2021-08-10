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
public class ICMS extends Imposto {

	public ICMS(Imposto impostoAdicional) {
		super(impostoAdicional);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
