package it.epicode.w6d2p.model;

import lombok.Data;

import java.util.Random;

@Data
public class BlogPost {
    private int id = new Random().nextInt(1, Integer.MAX_VALUE);
    private String contenuto;
    private String titolo;
    private String cover = "https://picsum.photos/200/300";
    private String categoria;
    private int tempoLettura;
}
