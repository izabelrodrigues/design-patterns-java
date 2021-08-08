/**
 *
 */
package br.com.izabelrodrigues.loja.state.orcamento.situacao;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.DomainException;
import br.com.izabelrodrigues.loja.state.orcamento.OrcamentoState;

/**
 * @author Izabel Rodrigues
 *
 */
public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontroExtra(OrcamentoState orcamentoState) {
		return BigDecimal.ZERO;
	}

	public void aprovar(OrcamentoState orcamentoState) {
		throw new DomainException("O Or�amento n�o pode ser aprovado!");
	}

	public void reprovar(OrcamentoState orcamentoState) {
		throw new DomainException("O Or�amento n�o pode ser reprovado!");
	}

	public void finalizar(OrcamentoState orcamentoState) {
		throw new DomainException("O Or�amento n�o pode ser finalizado!");
	}

}
