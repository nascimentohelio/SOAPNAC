package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.repositorio.RepositorioProdutoStub.Produto;

/**
 * Servlet implementation class CadastraController
 */
public class CadastraController extends HttpServlet {
	private static final long serialVersionUID = 1L;

		
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		produto.setNome(request.getParameter("nome"));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		
		ProdutoBO produtoBO = new ProdutoBO();
		produtoBO.cadastrar(produto);
		
		Produto[] produtos = produtoBO.listar();
		
		
		request.setAttribute("resultado", produtos);
				
		request.getRequestDispatcher("cadastrar.jsp").forward(request, response);
		
		
	}

}
