
package modell;

import java.util.ArrayList;

public class Asztal {

    private ArrayList<Ital> italLista;
    
    public Asztal() throws AlkoholFokException {
        
        Sor csikiMalna = new Sor("Csíki Málnasör", "3%", Cimketipus.HAGYOMANYOS);
        Sor hidegKomlos = new Sor("Dreher Hidegkomlós", "4.5%", Cimketipus.HAGYOMANYOS, 60);
        Sor aranyAszok = new Sor("Arany Ászok", "4.2%", Cimketipus.REGI, 54);
      //teszthez:  Sor kivetelesSor = new Sor ("Kivételes Sör", "3.6", Cimketipus.UJ);
        
        Bor duzsiRoze = new Bor("Dúzsi Rozé", "11%", Cimketipus.HAGYOMANYOS, "félszáraz");
        Bor kontyosEper = new Bor("Kontyos Eperbor", "10.5%", Cimketipus.UJ, "édes");
        
        italLista = new ArrayList<>();
        this.italLista.add(csikiMalna);
        this.italLista.add(hidegKomlos);
        this.italLista.add(aranyAszok);
       // this.italLista.add(kivetelesSor);
        this.italLista.add(duzsiRoze);
        this.italLista.add(kontyosEper);
        
    }

    public ArrayList<Ital> getItalLista() {
        return italLista;
    }
    
    
    
    
}
