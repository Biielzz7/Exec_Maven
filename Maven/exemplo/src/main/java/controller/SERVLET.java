package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.viagem;
import persistence.GenericDAO;
import persistence.viagemDAO;


@WebServlet("/viagem")
public class SERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SERVLET() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cod = request.getParameter("cod");
		String placa = request.getParameter("placa");
		String ano = request.getParameter("ano");
		String marca = request.getParameter("marca");
		String nome = request.getParameter("nome");
		String des = request.getParameter("des");
		String botao = request.getParameter("botao");

		
		GenericDAO gen = new GenericDAO();
		viagemDAO v = new viagemDAO(gen);
		
		viagem vi = new viagem();
		List<viagem> viagens = new ArrayList<>();
		String erro = "";
		String saida = "";
		
		try {
			
			if(botao.equals("Buscar")) {
				vi = validar(cod, placa, ano, marca, nome, des, botao);
					vi = v.buscar(vi);
				
			}
		} catch(SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		} finally {
			request.setAttribute("saida", saida);
			request.setAttribute("erro", erro);
			request.setAttribute("viagem", vi);
			request.setAttribute("viagens", viagens);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("viagem.jsp");
			dispatcher.forward(request, response);
		}

	}

	private viagem validar(String cod, String placa, String ano, String marca, String nome, String des, String botao) throws IOException {
		
		viagem via = new viagem();
		
		if(botao.equals("Buscar")) {
			if(cod.equals("")) {
				throw new IOException("Preencher Codigo de Viagem");
			} else {
				via.setCodigoViagem(Integer.parseInt(cod));
			}
			
		}
		return via;
	}
	

}
	
