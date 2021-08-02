/**
 *
 */
package br.com.izabelrodrigues.loja.adapter;

import java.math.BigDecimal;

import br.com.izabelrodrigues.loja.orcamento.RegistroOrcamento;
import br.com.izabelrodrigues.loja.state.orcamento.OrcamentoState;

/**
 * @author Izabel Rodrigues
 *
 */
public class TesteAdapters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OrcamentoState orcamento = new OrcamentoState(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new HttpAdapterImpl01());
		registro.registrar(orcamento);

		RegistroOrcamento registro2 = new RegistroOrcamento(new HttpAdapterImpl02());
		registro2.registrar(orcamento);
	}

}
