/**
 *
 */
package br.com.izabelrodrigues.loja.adapter;

import java.util.Map;

/**
 * @author Izabel Rodrigues
 *
 */
public interface HttpAdapter {

	void post(String url, Map<String, Object> dados);
}
