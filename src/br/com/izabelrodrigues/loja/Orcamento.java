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
	

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}


	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	
	
}
