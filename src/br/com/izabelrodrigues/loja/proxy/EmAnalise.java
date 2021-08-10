/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.state.orcamento.OrcamentoState;

/**
 * @author Izabel Rodrigues
 *
 */
public class EmAnalise extends SituacaoOrcamento {

	public BigDecimal calcularDescontroExtra(OrcamentoState orcamentoState) {
		return orcamentoState.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
