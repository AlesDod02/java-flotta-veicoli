package org.generation.java.lesson;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    private ArrayList<Veicolo> flotta= new ArrayList<>();




    public List<Veicolo> getFlotta() {
        return flotta;
    }

    public void setFlotta(ArrayList<Veicolo> flotta) {
        this.flotta = flotta;
    }



    public void addNewVeicolo (Veicolo nuovoVeicolo){

        for (Veicolo veicolo : flotta){
            if (veicolo.getTarga().equals(nuovoVeicolo.getTarga())){
                System.out.println("Hey! Un veicolo con questa targa è già presente!");
                return;
            }
        }
        flotta.add(nuovoVeicolo);

    }

    public Veicolo trovaVeicolo(String targa) {
        for (Veicolo veicolo : flotta) {
            if (veicolo.getTarga().equals(targa)) {
                return veicolo;
            }
        }
        return null;
    }

    public void getNumVeicoli (){
        int counterAuto = 0;
        int counterMoto = 0;
        String response = null;
        for (Veicolo veicolo : flotta){
            if(veicolo instanceof Automobile){
                counterAuto ++;
            } else if (veicolo instanceof Motocicletta){
                counterMoto ++;
            }
        }
        System.out.println("I veicoli di tipo automobile sono: " + counterAuto + ", mentre i veicoli di tipo motocicletta sono: " + counterMoto) ;
    }


}
