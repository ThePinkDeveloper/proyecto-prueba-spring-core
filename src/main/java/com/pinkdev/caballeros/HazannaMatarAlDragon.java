package com.pinkdev.caballeros;

import java.io.PrintStream;

public class HazannaMatarAlDragon implements Hazanna {

    private PrintStream stream;

    public HazannaMatarAlDragon(PrintStream stream) {
        this.stream = stream;
    }

    public void embarcar() {
        stream.println("Embarcando en la hazaña para matar al dragón");
    }
}   