package com.example.ahorcado.infra.console.config;

import com.example.ahorcado.infra.console.ConsoleReader;
import com.example.ahorcado.repository.impl.AhorcadoRepository;
import com.example.ahorcado.service.impl.AhorcadoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AhorcadoConfig {
    @Bean
    AhorcadoRepository getAhorcadoRepository(){
        return new AhorcadoRepository();
    }
    @Bean
    AhorcadoService getAhorcadoService(){
        return new AhorcadoService(getAhorcadoRepository());
    }
    @Bean
    ConsoleReader getConsoleReader(){
        return new ConsoleReader(getAhorcadoService());
    }
}
