package org.generation.java.lesson;

public class Automobile extends Veicolo {
    private int Nporte;

    public Automobile(String targa, int annoImm, int nporte) {
        super(targa, annoImm);
        Nporte = nporte;
    }

    public int getNporte() {
        return Nporte;
    }

    public void setNporte(int nporte) {
        Nporte = nporte;
    }

    @Override
    public String toString() {
        return super.toString()+"è un'automobile";
    }
}
