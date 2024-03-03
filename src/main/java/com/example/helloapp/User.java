package com.example.helloapp;

public class User {
    private String nome;
    private String cognome;
    private String provincia;
    private String saluto;

    public User(String nome, String cognome,String provincia,String saluto) {
        this.nome = nome;
        this.cognome = cognome;
        this.provincia=provincia;
        this.saluto= saluto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }
}
