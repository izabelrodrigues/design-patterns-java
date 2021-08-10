/**
 *
 */
package br.com.izabelrodrigues.loja.proxy;

/**
 * @author Izabel Rodrigues
 *
 */
public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
