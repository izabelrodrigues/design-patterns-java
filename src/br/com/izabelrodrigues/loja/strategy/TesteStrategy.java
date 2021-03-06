/**
 * 
 */
package br.com.izabelrodrigues.loja.strategy;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class TesteStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println("IMPOSTO ICMS: " + calculadoraDeImpostos.calcular(orcamento, new ICMS()));
		System.out.println("IMPOSTO ISS: " + calculadoraDeImpostos.calcular(orcamento, new ISS()));
	}

}
