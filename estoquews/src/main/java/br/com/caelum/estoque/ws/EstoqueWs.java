package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWs {

	private ItemDao dao = new ItemDao();
	
//	@WebMethod(operationName = "todosOsItens")
//	@WebResult(name = "itens")
//	public ListaItens getItens(@WebParam(name="filtros") Filtros filtros){
//		System.out.println("Chamando todosItens()");
//		List<Filtro> lista = filtros.getLista();
//		List<Item> itensResultado = dao.todosItens(lista);
//		return new ListaItens(itensResultado);
//	}
	
	@WebMethod(operationName = "todosOsItens")
	@WebResult(name = "item")
	@ResponseWrapper(localName = "itens")
	@RequestWrapper(localName = "listaItens")
	public List<Item> getItens(@WebParam(name="filtros") Filtros filtros){
		System.out.println("Chamando todosItens()");
		return dao.todosItens();
	}
}
