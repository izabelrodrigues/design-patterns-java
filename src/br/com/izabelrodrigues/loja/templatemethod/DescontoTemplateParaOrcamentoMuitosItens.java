/**
 *
 */
package br.com.izabelrodrigues.loja.templatemethod;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class DescontoTemplateParaOrcamentoMuitosItens extends DescontoTemplate {

	private static final int QUANTIDADE_PARA_DESCONTO = 5;

	public DescontoTemplateParaOrcamentoMuitosItens(DescontoTemplate proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal obtemValorDesconto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.10"));
	}

	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > QUANTIDADE_PARA_DESCONTO;
	}
}
