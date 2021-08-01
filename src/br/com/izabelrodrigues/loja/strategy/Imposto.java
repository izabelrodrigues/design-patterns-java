/**
 * 
 */
package br.com.izabelrodrigues.loja.strategy;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
