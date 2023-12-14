package org.generation.java.lesson;

public abstract class Veicolo {
   private String targa;


   private int annoImm;

   public Veicolo(String targa, int annoImm) {
      this.targa = targa;
      this.annoImm = annoImm;
   }

   public String getTarga() {
      return targa;
   }

   public void setTarga(String targa) {
      this.targa = targa;
   }

   public int getAnnoImm() {
      return annoImm;
   }

   public void setAnnoImm(int annoImm) {
      this.annoImm = annoImm;
   }

   @Override
   public String toString() {
      return "Veicolo{" +
              "targa='" + targa + '\'' +
              ", annoImm=" + annoImm +
              '}';
   }
}
