package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.entidade.Produto;
import br.com.fiap.repositorio.RepositorioProduto;

public class TesteProduto {

	public static RepositorioProduto repositorioProduto = new RepositorioProduto();

	public static void main(String[] args) {

		criar();
		listar();

		remover();
		listar();
		
		atualizar();
		
		listar();

	}

	public static void remover() {
		System.out.println("----------remover--------------");
		repositorioProduto.remover(3);

	}
	

	public static void atualizar() {
		System.out.println("----------atualizar--------------");
		Produto produto = new Produto();
		produto.setCodigo(2);
		produto.setDescricao("Cabo usb");
		produto.setValor(5.0);
		repositorioProduto.atualizar(produto);

	}

	public static void criar() {
		System.out.println("-------cria-------");
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setDescricao("Mouse pad");
		produto.setValor(50.0);
		repositorioProduto.cadastrar(produto);

		Produto produto1 = new Produto();
		produto1.setCodigo(2);
		produto1.setDescricao("Teclado");
		produto1.setValor(110.0);
		repositorioProduto.cadastrar(produto1);

		Produto produto2 = new Produto();
		produto2.setCodigo(3);
		produto2.setDescricao("Monitor 15");
		produto2.setValor(220.0);
		repositorioProduto.cadastrar(produto2);

	}

	public static void listar() {
		System.out.println("-------exibe-------");
		List<Produto> listarProduto = new ArrayList<Produto>();
		listarProduto = repositorioProduto.listar();

		for (Produto produto : listarProduto) {
			System.out.println(produto.getCodigo() + " " + produto.getDescricao() + " " + produto.getValor());
			System.out.println("-------------------------------");
		}

	}
}
