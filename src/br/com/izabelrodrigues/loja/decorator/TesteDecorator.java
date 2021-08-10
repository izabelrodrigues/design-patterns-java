/**
 *
 */
package br.com.izabelrodrigues.loja.decorator;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class TesteDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println("IMPOSTO ICMS: " + calculadoraDeImpostos.calcular(orcamento, new ICMS(null)));
		System.out.println("IMPOSTO ISS: " + calculadoraDeImpostos.calcular(orcamento, new ISS(null)));
		System.out.println(
				"IMPOSTO CONJUNTO ICMS ISS: " + calculadoraDeImpostos.calcular(orcamento, new ICMS(new ISS(null))));
	}

}
