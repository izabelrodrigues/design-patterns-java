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
public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.efetuaCalculoImpostoTotal(orcamento);
	}

}
