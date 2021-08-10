/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;

/**
 * @author Izabel Rodrigues
 *
 */
public class OrcamentoProxy extends Orcamento {

	private BigDecimal valor;
	private Orcamento orcamento;

	public OrcamentoProxy(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	@Override
	public BigDecimal getValor() {
		if (this.valor == null) {
			this.valor = orcamento.getValor();
		}
		return this.valor;
	}

}
