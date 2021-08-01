/**
 * 
 */
package br.com.izabelrodrigues.loja;

import java.math.BigDecimal;

/**
 * @author Izabel Rodrigues
 *
 */
public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
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
	
}
