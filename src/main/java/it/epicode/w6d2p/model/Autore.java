package it.epicode.w6d2p.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Random;

@Data
public class Autore {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, LocalDate dataNascita) {
        this.id = new Random().nextInt(1, Integer.MAX_VALUE);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.avatar = "https://ui-avatars.com/api/?name="+nome+"+"+cognome;
    }


}
