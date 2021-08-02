/**
 *
 */
package br.com.izabelrodrigues.loja.state.orcamento.situacao;

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
	public void aprovar(OrcamentoState orcamentoState) {
		orcamentoState.setSituacao(new Aprovado());
	}

	@Override
	public void reprovar(OrcamentoState orcamentoState) {
		orcamentoState.setSituacao(new Reprovado());
	}
}
