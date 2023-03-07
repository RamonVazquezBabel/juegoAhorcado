package com.example.ahorcado.repository.impl;

import com.example.ahorcado.repository.IAhorcadoRepository;

public class AhorcadoRepository implements IAhorcadoRepository {
    @Override
    public String getPalabraSecreta() {
        return null;
    }

    @Override
    public char[] getGuionesFromPalabra(String palabra) {
        return new char[0];
    }
}
