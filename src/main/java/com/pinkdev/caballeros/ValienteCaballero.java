package com.pinkdev.caballeros;

public class ValienteCaballero implements Caballero {

    private Hazanna hazanna;

    public ValienteCaballero(Hazanna hazanna) {
        this.hazanna = hazanna;
    }

    public void embarcarEnHazanna() {
        this.hazanna.embarcar();
    }
}