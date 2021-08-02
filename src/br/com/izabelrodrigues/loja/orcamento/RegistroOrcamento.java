/**
 *
 */
package br.com.izabelrodrigues.loja.orcamento;

import java.util.Map;

import br.com.izabelrodrigues.loja.DomainException;
import br.com.izabelrodrigues.loja.adapter.HttpAdapter;
import br.com.izabelrodrigues.loja.state.orcamento.OrcamentoState;

/**
 * @author Izabel Rodrigues
 *
 */
public class RegistroOrcamento {

	private HttpAdapter http;

	public RegistroOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(OrcamentoState orcamento) {

		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não Finalizado!");
		}
		String url = "http://api/v1/oracamento/registrar";
		Map<String, Object> dados = Map.of(//
				"valor", orcamento.getValor(), //
				"quantidadeItens", orcamento.getQuantidadeItens());
		http.post(url, dados);
	}

}
