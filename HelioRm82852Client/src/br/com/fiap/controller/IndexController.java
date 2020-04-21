package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.repositorio.RepositorioProdutoStub.Produto;


/**
 * Servlet implementation class IndexController
 */
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoBO produtoBO =  new ProdutoBO();
		Produto[] produtos = produtoBO.listar();
		
		request.setAttribute("produtos", produtos);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
		
		
		
	}

}
