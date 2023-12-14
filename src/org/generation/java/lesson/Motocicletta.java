package org.generation.java.lesson;

public class Motocicletta extends Veicolo {
    private boolean cavalletto;

    public Motocicletta(String targa, int annoImm, boolean cavalletto) {

        super(targa, annoImm);

        this.cavalletto=cavalletto;
    }

    public boolean isCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }

    @Override
    public String toString() {
        return super.toString() +"è una motocicletta";
    }
}
