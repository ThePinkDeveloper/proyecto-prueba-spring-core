package com.pinkdev.caballeros.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pinkdev.caballeros.ValienteCaballero;
import com.pinkdev.caballeros.Caballero;
import com.pinkdev.caballeros.Hazanna;
import com.pinkdev.caballeros.HazannaMatarAlDragon;

@Configuration
public class ConfiguracionCaballero {

    @Bean
    public Caballero caballero() {
        return new ValienteCaballero(hazanna());
    }

    @Bean
    public Hazanna hazanna() {
        return new HazannaMatarAlDragon(System.out);
    }
}