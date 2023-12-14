package org.generation.java.lesson;

public class Main {
    public static void main(String[] args) {
        GestoreFlotta alessandro = new GestoreFlotta();

        Automobile auto1 = new Automobile("GDHAG",2024,5);
        Automobile auto2 = new Automobile("GDHAG",2024,5);

        alessandro.addNewVeicolo(auto1);
        alessandro.getNumVeicoli();
        System.out.println(alessandro.trovaVeicolo("GDHAG"));

        alessandro.addNewVeicolo(auto2);

    }


}
