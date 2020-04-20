package br.com.fiap.repositorio;

import java.util.ArrayList;

import java.util.List;

import br.com.fiap.entidade.Produto;

public class RepositorioProduto implements IRepositorioProduto {

	public static List<Produto> listaProduto = new ArrayList<Produto>();

	@Override
	public boolean cadastrar(Produto produto) {
		try {
			listaProduto.add(produto);

		} catch (Exception e) {
			return false;
		}

		return true;

	}

	@Override
	public boolean atualizar(Produto produto) {
		if (produto != null) {
			for (Produto produto1 : listaProduto) {
				if (produto1.getCodigo() == produto.getCodigo()) {
					int index = listaProduto.indexOf(produto1);
					listaProduto.set(index, produto);
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public boolean remover(int codigo) {
		for (Produto produto : listaProduto) {
			if (produto.getCodigo() == codigo) {
				listaProduto.remove(produto);
				System.out.println("Removido o produto: " + produto.getDescricao());
				return true;
			}

		}
		return false;
	}

	@Override
	public List<Produto> listar() {

		return listaProduto;
	}

}
