package br.edu.ifsp.spo.contatos.controller;

import br.edu.ifsp.spo.contatos.model.Contato;
import br.edu.ifsp.spo.contatos.model.ContatoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;


public class ListarContatosServlet extends HttpServlet {
    private ContatoDAO contatoDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        contatoDAO = new ContatoDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<Integer, Contato> contatos = contatoDAO.listar();

        request.setAttribute("contatos", contatos.values());
        request.getRequestDispatcher("/listar.jsp").forward(request, response);
    }
}