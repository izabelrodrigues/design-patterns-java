/**
 *
 */
package br.com.izabelrodrigues.loja.chainresponsibility;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class TesteChainResponsibility {

	public static void main(String[] args) {

		Orcamento orcamento01 = new Orcamento(new BigDecimal(200), 6);
		Orcamento orcamento02 = new Orcamento(new BigDecimal(1000), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento01));
		System.out.println(calculadora.calcular(orcamento02));

	}
}
