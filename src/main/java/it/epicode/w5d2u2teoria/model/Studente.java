package it.epicode.w5d2u2teoria.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Studente {
    private int matricola;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
}
