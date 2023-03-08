package com.example.ahorcado.service.impl;

import com.example.ahorcado.repository.impl.AhorcadoRepository;
import com.example.ahorcado.service.IAhorcadoService;

import java.util.Random;

public class AhorcadoService implements IAhorcadoService {
    private AhorcadoRepository ahorcadoRepository;

    public AhorcadoService(AhorcadoRepository ahorcadoRepository){
        this.ahorcadoRepository = ahorcadoRepository;
    }
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

    @Override
    public boolean hayGuiones(char[] hayGuiones) {
        boolean hayGuionesIncompletos = false;
        for(char l : hayGuiones){
            if(l == '_') hayGuionesIncompletos = true;
        }
        return hayGuionesIncompletos;
    }
}
