/**
 *
 */
package br.com.izabelrodrigues.loja.templatemethod;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.Orcamento;

/**
 * @author Izabel Rodrigues
 *
 */
public class TesteTemplateMethod {

	public static void main(String[] args) {

		Orcamento orcamento01 = new Orcamento(new BigDecimal(500), 6);
		Orcamento orcamento02 = new Orcamento(new BigDecimal(600), 1);

		CalculadoraDeDescontosTemplate calculadora = new CalculadoraDeDescontosTemplate();
		System.out.println("DESCONTO PARA MUITOS ITENS: " + calculadora.calcular(orcamento01));
		System.out.println("DESCONTO POR VALOR: " + calculadora.calcular(orcamento02));

	}
}
