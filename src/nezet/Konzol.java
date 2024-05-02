
package nezet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modell.AlkoholFokException;
import modell.Asztal;
import modell.Ital;
import modell.Bor;
import modell.Sor;

public class Konzol {
    
    private ArrayList<Ital> asztalItalai;
    
    public Konzol() throws AlkoholFokException {
        Asztal asztal = new Asztal();
        asztalItalai = asztal.getItalLista();
        ArrayList<Sor> sorLista = new ArrayList<>();
        ArrayList<Bor> borLista = new ArrayList<>();
        
        for (Ital ital : asztalItalai) {   
            try {
                if(ital instanceof Sor){
                    sorLista.add((Sor)ital);
                }
                if(ital instanceof Bor){
                    borLista.add((Bor)ital);
                }
            } catch (Exception e) {
                System.out.println("Valami hiba történt! A(z) " + ital.getNev() + " se nem sör, se nem bor!");
            }
        }
        
        feladatok();
    }

    private void feladatok() {
        italokAsztalon();
        italokFajlban();
        statisztika();
    }

    private void italokAsztalon() {

    }

    private void italokFajlban() {
        
        String txt="";
        for (Ital ital : asztalItalai) {
            txt += ital.getNev();
            if(ital instanceof Sor){
                    txt += " (Sör)";
                }
                if(ital instanceof Bor){
                    txt += " (Bor)";
                }
        }
        
        try {
            FileWriter kiir = new FileWriter("italok.txt");
            kiir.write("Files in Java might be tricky, but it is fun enough!");
            kiir.close();
            System.out.println("Sikeres kiírás!");
          } catch (IOException e) {
            System.out.println("Hiba!");
        }
    }

    private void statisztika() {

    }
    
    
}
