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
			System.out.println("Aplicando desconto por quantidade de itens acima de 5");
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
		}

		return proximo.calcular(orcamento);
	}
}
