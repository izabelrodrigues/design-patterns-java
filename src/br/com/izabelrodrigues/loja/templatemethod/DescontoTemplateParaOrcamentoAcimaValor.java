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
public class DescontoTemplateParaOrcamentoAcimaValor extends DescontoTemplate {

	public DescontoTemplateParaOrcamentoAcimaValor(DescontoTemplate proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal obtemValorDesconto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
