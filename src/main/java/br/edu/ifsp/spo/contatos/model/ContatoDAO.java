package br.edu.ifsp.spo.contatos.model;

import java.util.HashMap;
import java.util.Map;

public class ContatoDAO {
    private static Map<Integer, Contato> contatos = new HashMap<>();

    public void salvar(Contato contato) {
        int id = contatos.size() + 1;
        contatos.put(id, contato);
    }

    public Map<Integer, Contato> listar() {
        return contatos;
    }
}