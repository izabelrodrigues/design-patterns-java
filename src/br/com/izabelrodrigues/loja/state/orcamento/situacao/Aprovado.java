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
public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularDescontroExtra(OrcamentoState orcamentoState) {
		return orcamentoState.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(OrcamentoState orcamentoState) {
		orcamentoState.setSituacao(new Finalizado());
	}
}
