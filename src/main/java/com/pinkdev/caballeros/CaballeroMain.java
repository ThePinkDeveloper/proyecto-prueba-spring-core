package com.pinkdev.caballeros;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pinkdev.caballeros.config.ConfiguracionCaballero;

public class CaballeroMain {

    public static void main(String[] args) throws Exception {

        // Cargamos el contexto de spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionCaballero.class);
        // Obtenemos el bean del caballero
        Caballero caballero = context.getBean(Caballero.class);
        // Usamos al caballero
        caballero.embarcarEnHazanna();
        // Cerramos el contexto
        context.close();
    }

}

