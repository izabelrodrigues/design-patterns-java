/**
 *
 */
package br.com.izabelrodrigues.loja.composite;

import java.math.BigDecimal;



/**
 * @author Izabel Rodrigues
 *
 */
public class TesteComposite {

	public static void main(String[] args) {

		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
		orcamentoAntigo.reprovar();

		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal(500)));
		orcamentoNovo.adicionarItem(orcamentoAntigo);

		calcularDesconto(orcamentoNovo);

		calcularValorOrcamento(orcamentoNovo);

	}

	private static void calcularValorOrcamento(Orcamento orcamentoNovo) {
		System.out.println("Valor do orçamento com Composite:" + orcamentoNovo.getValor());
	}

	private static void calcularDesconto(Orcamento orcamentoNovo) {
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println("DESCONTO USANDO COMPOSITE: " + calculadora.calcular(orcamentoNovo));
	}

}
