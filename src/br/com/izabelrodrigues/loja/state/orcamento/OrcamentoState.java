/**
 *
 */
package br.com.izabelrodrigues.loja.state.orcamento;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.state.orcamento.situacao.EmAnalise;
import br.com.izabelrodrigues.loja.state.orcamento.situacao.Finalizado;
import br.com.izabelrodrigues.loja.state.orcamento.situacao.SituacaoOrcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class OrcamentoState {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;


	public OrcamentoState(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}


	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @return the quantidadeItens
	 */
	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	/**
	 * @return the situacao
	 */
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularDescontroExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}

}
