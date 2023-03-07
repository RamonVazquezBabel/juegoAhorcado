package com.example.ahorcado.infra.console;

import com.example.ahorcado.domain.Ahorcado;
import com.example.ahorcado.service.impl.AhorcadoService;

import javax.annotation.PostConstruct;

public class ConsoleReader {
    private AhorcadoService ahorcadoService;
    public ConsoleReader(AhorcadoService ahorcadoService){
        this.ahorcadoService = ahorcadoService;
    }

    @PostConstruct
    public void init(){

    }

   /* do{

    }while(true){

    }

    */
}
