package com.example.ahorcado.service;

public interface IAhorcadoService {
    String getPalabraSecreta();
    char[] getGuionesFromPalabra(String palabra);
    boolean hayGuiones(char[] hayGuiones);
}
