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
        int intentos = 8;
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
                    char[] palabraGuiones = ahorcadoService.getGuionesFromPalabra(palabraSecreta);
                    boolean juegoTerminado = false;
                    do{
                        System.out.println("Te quedan " +intentos+" intentos");
                        System.out.println(palabraGuiones);
                        System.out.println("Introduce una letra");
                        char letra = sc.next().charAt(0);
                        boolean letraAcertada = false;
                        for(int i = 0; i<palabraSecreta.length();i++){
                            if(palabraSecreta.charAt(i) == letra){
                                palabraGuiones[i] = letra;
                                letraAcertada = true;
                            }
                        }
                        if(!letraAcertada){
                            System.out.println("No has acertado ninguna letra");
                            intentos--;
                            if(intentos == 0) {
                                System.out.println("Has perdido porque te has quedado sin intentos");
                                juegoTerminado = true;
                            }
                        }else{
                            boolean juegoGanado = !ahorcadoService.hayGuiones(palabraGuiones);
                            if (juegoGanado) {
                                System.out.println("Has ganado el juego");
                                juegoTerminado = true;
                            }
                        }
                    }while(!juegoTerminado);

                    break;
                case 2:
                    System.out.println("Hasta luego");

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }
        }
    }

   /* do{

    }while(true){

    }

    */
}
