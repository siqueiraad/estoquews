package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWs {

	public static void main(String[] args) {

		EstoqueWs implementacaoWs = new EstoqueWs();
		String URL = "http://localhost:8080/estoquews";
		
		System.out.println("Estoque WS rodando: " + URL);
		
		//associando URL com a implementacao
		Endpoint.publish(URL, implementacaoWs);
	}

}
