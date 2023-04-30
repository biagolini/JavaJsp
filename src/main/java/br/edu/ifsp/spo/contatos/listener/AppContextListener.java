package br.edu.ifsp.spo.contatos.listener;


import br.edu.ifsp.spo.contatos.model.Contato;
import br.edu.ifsp.spo.contatos.model.ContatoDAO;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.util.Calendar;
import java.util.Date;

public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ContatoDAO contatoDAO = new ContatoDAO();
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(1989, Calendar.OCTOBER, 24);
        Date dataNascDate = dataNascimento.getTime();

        Contato contato = new Contato("Carlos", "carlos@gmail.com", "Rua A, 123", dataNascDate);
        contatoDAO.salvar(contato);
    }

}
