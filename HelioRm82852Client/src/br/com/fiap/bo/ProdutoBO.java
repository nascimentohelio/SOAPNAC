package br.com.fiap.bo;

import br.com.fiap.repositorio.RepositorioProdutoStub;
import br.com.fiap.repositorio.RepositorioProdutoStub.Cadastrar;
import br.com.fiap.repositorio.RepositorioProdutoStub.CadastrarResponse;
import br.com.fiap.repositorio.RepositorioProdutoStub.Listar;
import br.com.fiap.repositorio.RepositorioProdutoStub.ListarResponse;
import br.com.fiap.repositorio.RepositorioProdutoStub.Produto;

public class ProdutoBO {

	public ProdutoBO() {}

	public Produto[]listar() {

		
		try {
			RepositorioProdutoStub repositorioProdutoStub = new RepositorioProdutoStub();

			Listar listar = new Listar();

			ListarResponse listarResponse = new ListarResponse();
			listarResponse = repositorioProdutoStub.listar(listar);

			return listarResponse.get_return();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return null;
	}
	
	public boolean cadastrar(Produto produto) {
				
		try {
			RepositorioProdutoStub repositorioProdutoStub = new RepositorioProdutoStub();
			
			Cadastrar cadastrar = new Cadastrar();
			cadastrar.setProduto(produto);
			
			CadastrarResponse cadastrarResponse = new CadastrarResponse();			
			cadastrarResponse = repositorioProdutoStub.cadastrar(cadastrar);
			
			return cadastrarResponse.get_return();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		return false;
	}
	
	
}
