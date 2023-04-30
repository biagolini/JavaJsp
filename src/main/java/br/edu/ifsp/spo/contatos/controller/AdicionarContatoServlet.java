package br.edu.ifsp.spo.contatos.controller;

import br.edu.ifsp.spo.contatos.model.Contato;
import br.edu.ifsp.spo.contatos.model.ContatoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdicionarContatoServlet extends HttpServlet {
    private ContatoDAO contatoDAO;
    private SimpleDateFormat dateFormat;

    @Override
    public void init() throws ServletException {
        super.init();
        contatoDAO = new ContatoDAO();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String endereco = request.getParameter("endereco");
        String dataNascimentoStr = request.getParameter("dataNascimento");

        Date dataNascimento;
        try {
            dataNascimento = dateFormat.parse(dataNascimentoStr);
        } catch (ParseException e) {
            throw new ServletException("Data de nascimento inválida. Formato esperado: dd/MM/yyyy", e);
        }

        Contato contato = new Contato(nome, email, endereco, dataNascimento);
        contatoDAO.salvar(contato);

        response.sendRedirect("index.html");
    }
}
