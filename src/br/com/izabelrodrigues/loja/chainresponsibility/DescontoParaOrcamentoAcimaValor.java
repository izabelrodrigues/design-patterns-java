/**
 *
 */
package br.com.izabelrodrigues.loja.chainresponsibility;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class DescontoParaOrcamentoAcimaValor extends Desconto {

	public DescontoParaOrcamentoAcimaValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}

		return proximo.calcular(orcamento);
	}

}
