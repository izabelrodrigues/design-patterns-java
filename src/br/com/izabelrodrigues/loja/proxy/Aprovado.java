/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;

/**
 * @author Izabel Rodrigues
 *
 */
public class Aprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontroExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
