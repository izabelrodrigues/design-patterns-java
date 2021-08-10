/**
 *
 */
package br.com.izabelrodrigues.loja.composite;

import java.math.BigDecimal;



/**
 * @author Izabel Rodrigues
 *
 */
public class TesteDescontosComposite {

	public static void main(String[] args) {

		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
		orcamentoAntigo.reprovar();

		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal(500)));
		orcamentoNovo.adicionarItem(orcamentoAntigo);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamentoNovo));

	}

}
