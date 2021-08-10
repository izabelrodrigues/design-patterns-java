/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.DomainException;

/**
 * @author Izabel Rodrigues
 *
 */
public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontroExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new DomainException("O Or�amento n�o pode ser aprovado!");
	}

	public void reprovar(Orcamento orcamento) {
		throw new DomainException("O Or�amento n�o pode ser reprovado!");
	}

	public void finalizar(Orcamento orcamento) {
		throw new DomainException("O Or�amento n�o pode ser finalizado!");
	}

}
