package br.edu.ifsp.spo.contatos.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private Date dataNascimento;
}