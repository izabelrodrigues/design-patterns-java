/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Izabel Rodrigues
 *
 */
public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}

	/**
	 * @return the valor
	 */
	@Override
	public BigDecimal getValor() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e.getMessage());
		}
		return this.valor;
	}

	/**
	 * @return the situacao
	 */
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	/**
	 * @return the itens
	 */
	public List<Orcavel> getItens() {
		return itens;
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

	public int getQuantidadeItens() {
		return itens.size();
	}

	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);

	}

}
