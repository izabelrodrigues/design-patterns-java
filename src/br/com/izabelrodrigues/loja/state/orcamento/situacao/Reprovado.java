/**
 *
 */
package br.com.izabelrodrigues.loja.state.orcamento.situacao;

import br.com.izabelrodrigues.loja.state.orcamento.OrcamentoState;

/**
 * @author Izabel Rodrigues
 *
 */
public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(OrcamentoState orcamentoState) {
		orcamentoState.setSituacao(new Finalizado());
	}
}
