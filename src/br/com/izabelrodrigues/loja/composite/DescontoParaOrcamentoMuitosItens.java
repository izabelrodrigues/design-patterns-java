/**
 *
 */
package br.com.izabelrodrigues.loja.composite;

import java.math.BigDecimal;


/**
 * @author Izabel Rodrigues
 *
 */
public class DescontoParaOrcamentoMuitosItens extends Desconto {

	private static final int QUANTIDADE_PARA_DESCONTO = 5;

	public DescontoParaOrcamentoMuitosItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > QUANTIDADE_PARA_DESCONTO) {
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
		}

		return proximo.calcular(orcamento);
	}
}
