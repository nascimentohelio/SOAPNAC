package br.com.fiap.repositorio;

import java.util.List;

import br.com.fiap.entidade.Produto;

public interface IRepositorioProduto {
	
		
	public boolean cadastrar(Produto produto);
	
	public boolean atualizar(Produto produto);
	
	public boolean remover(int codigo);
	
	
	public List<Produto> listar();
	
		

}
