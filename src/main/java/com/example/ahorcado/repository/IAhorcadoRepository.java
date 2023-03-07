package com.example.ahorcado.repository;

public interface IAhorcadoRepository {
    String getPalabraSecreta();
    char[] getGuionesFromPalabra(String palabra);
}
