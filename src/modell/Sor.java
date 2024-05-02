
package modell;

import java.util.Random;
import java.util.UUID;

public class Sor extends Ital {
    
    private final UUID azonosito;
    private int malataArany;
    
    public Sor(String nev, String alkoholFok, Cimketipus cimke) throws AlkoholFokException {
        super(nev, alkoholFok, cimke);
        this.azonosito = UUID.randomUUID();
        int rndMalata = new Random().nextInt(50, 75);
        this.malataArany = rndMalata;
    }

    public Sor(String nev, String alkoholFok, Cimketipus cimke, int malataArany) throws AlkoholFokException {
        super(nev, alkoholFok, cimke);
        this.azonosito = UUID.randomUUID();
        this.malataArany = malataArany;
    }

    public UUID getAzonosito() {
        return azonosito;
    }

    public int getMalataArany() {
        return malataArany;
    }

    @Override
    public String toString() {
        return "Sor{" + "azonosito=" + azonosito + ", malataArany=" + malataArany + '}';
    }
    
    
}
