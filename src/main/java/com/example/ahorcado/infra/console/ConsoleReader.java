package com.example.ahorcado.infra.console;

import com.example.ahorcado.domain.Ahorcado;
import com.example.ahorcado.service.impl.AhorcadoService;

import javax.annotation.PostConstruct;
import java.util.Scanner;

public class ConsoleReader {
    private AhorcadoService ahorcadoService;
    public ConsoleReader(AhorcadoService ahorcadoService){
        this.ahorcadoService = ahorcadoService;
    }

    @PostConstruct
    public void init(){
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        String entradaConsola;
        while(opcion!=0){
            System.out.println("Menu por consola");
            System.out.println("1- Iniciar ahorcado");
            System.out.println("2- Salir");
            entradaConsola = sc.next();

            try{
                opcion = Integer.parseInt(entradaConsola);
            }catch(Exception e){
                System.out.println("Opcion no valida, ingrese un numero");
            }
            switch (opcion){
                case 1:
                    String palabraSecreta = ahorcadoService.getPalabraSecreta();
                    do{

                    }while(){

                }
                    break;
                case 2:
                    System.out.println("Hasta luego");

                    break;
            }
        }
    }

   /* do{

    }while(true){

    }

    */
}
