/**
 * 
 */
package br.com.izabelrodrigues.loja.strategety;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
