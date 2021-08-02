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
public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		/**
		 * O Desconto vai buscar por um desconto a ser aplicado na ordem : muitos itens,
		 * por valor e sem desconto ( padrao )
		 */
		DescontoPadrao descontoPadrao = new DescontoPadrao();
		DescontoParaOrcamentoAcimaValor descontoPorValor = new DescontoParaOrcamentoAcimaValor(descontoPadrao);
		DescontoParaOrcamentoMuitosItens descontoPorQuantidadeItens = new DescontoParaOrcamentoMuitosItens(
				descontoPorValor);

		return descontoPorQuantidadeItens.calcular(orcamento);
	}
}
