package com.example.ahorcado.domain;

public class Ahorcado {
    private String palabraSecreta;
    private char[] palabraGuiones;
    private boolean juegoTerminado;

    public Ahorcado() {
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public char[] getPalabraGuiones() {
        return palabraGuiones;
    }

    public void setPalabraGuiones(char[] palabraGuiones) {
        this.palabraGuiones = palabraGuiones;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public void setJuegoTerminado(boolean juegoTerminado) {
        this.juegoTerminado = juegoTerminado;
    }
}
