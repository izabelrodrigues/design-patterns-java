/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

import java.math.BigDecimal;



/**
 * @author Izabel Rodrigues
 *
 */
public class TesteProxy {

	public static void main(String[] args) {

		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
		orcamentoAntigo.reprovar();

		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal(500)));
		orcamentoNovo.adicionarItem(orcamentoAntigo);

		OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamentoNovo);
		imprimeValorComTempo(orcamentoProxy, 1);
		imprimeValorComTempo(orcamentoProxy, 2);
		imprimeValorComTempo(orcamentoProxy, 3);
		imprimeValorComTempo(orcamentoProxy, 4);
		imprimeValorComTempo(orcamentoProxy, 5);

	}

	private static void imprimeValorComTempo(OrcamentoProxy orcamentoProxy, int posicaoExecucao) {
		long startTime = System.nanoTime();
		System.out.println(orcamentoProxy.getValor());
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Na execução número " + posicaoExecucao + " gastei " + duration / 1000000 + " ms");
	}


}
