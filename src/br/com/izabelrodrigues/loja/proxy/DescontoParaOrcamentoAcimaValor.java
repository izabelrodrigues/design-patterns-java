/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;


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
			System.out.println("Aplicando desconto de 5% - orçamento acima de valor ...");
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}

		return proximo.calcular(orcamento);
	}

}
