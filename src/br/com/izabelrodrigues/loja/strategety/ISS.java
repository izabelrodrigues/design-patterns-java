/**
 * 
 */
package br.com.izabelrodrigues.loja.strategety;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
