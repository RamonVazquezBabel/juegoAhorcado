package com.example.ahorcado.service.impl;

import com.example.ahorcado.service.IAhorcadoService;

import java.util.Random;

public class AhorcadoService implements IAhorcadoService {
    @Override
    public String getPalabraSecreta() {
        String [] palabras = {"melon","platano","naranja","manzana","sandia","pera","kiwi","mango","pimiento","cebolla"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);
        return palabras[n];
    }

    @Override
    public char[] getGuionesFromPalabra(String palabra) {
        int letrasPalabraSecreta = palabra.length();
        char[] palabraGuiones = new char[letrasPalabraSecreta];
        for(int i = 0; i < palabraGuiones.length; i++){
            palabraGuiones[i] = '_';
        }
        return palabraGuiones;
    }
}
