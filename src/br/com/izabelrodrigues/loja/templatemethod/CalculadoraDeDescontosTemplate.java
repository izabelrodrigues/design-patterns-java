/**
 *
 */
package br.com.izabelrodrigues.loja.templatemethod;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class CalculadoraDeDescontosTemplate {

	public BigDecimal calcular(Orcamento orcamento) {

		/**
		 * O Desconto vai buscar por um desconto a ser aplicado na ordem : muitos itens,
		 * por valor e sem desconto ( padrao )
		 */
		DescontoTemplatePadrao descontoPadrao = new DescontoTemplatePadrao();
		DescontoTemplateParaOrcamentoAcimaValor descontoPorValor = new DescontoTemplateParaOrcamentoAcimaValor(descontoPadrao);
		DescontoTemplateParaOrcamentoMuitosItens descontoPorQuantidadeItens = new DescontoTemplateParaOrcamentoMuitosItens(
				descontoPorValor);

		return descontoPorQuantidadeItens.calcular(orcamento);
	}
}
