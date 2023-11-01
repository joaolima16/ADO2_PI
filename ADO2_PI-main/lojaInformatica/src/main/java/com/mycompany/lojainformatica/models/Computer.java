package com.mycompany.lojainformatica.models;

public class Computer {

    private static String marca = "JoaoVitorDeLima";
    private String hd;
    private String processador;
    private int id;

    public Computer() {
    }

    public Computer(String hd, String processador) {
        this.hd = hd;
        this.processador = processador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Computer.marca = marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

}
