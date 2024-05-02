
package modell;

enum Cimketipus{
         REGI,
         UJ,
         HAGYOMANYOS
     };

public abstract class Ital {

    private String nev;
    private String alkoholFok;
    private Cimketipus cimke;
    
    /* szerintem erre nincs szükség, mindig várunk értékadást
    public Ital() {
    }
*/

    public Ital(String nev, String alkoholFok, Cimketipus cimke) throws AlkoholFokException {
        this.nev = nev;
        setAlkoholFok(alkoholFok);
        this.cimke = cimke;
    }

    public void setAlkoholFok(String alkoholFok) throws AlkoholFokException {
        if (!alkoholFok.contains("%")) {
            throw new AlkoholFokException("Ez nem egy százalékos érték!");
        } else {
            if(!alkoholFok.contains(".")){
                String joAlkoholFok="";
                for (int i = 0; i < alkoholFok.length()-1; i++) {
                        joAlkoholFok += alkoholFok.charAt(i);
                      }
                joAlkoholFok+=".0%";
                alkoholFok=joAlkoholFok;
            }
            this.alkoholFok = alkoholFok;
        }
    }

    public void setCimke(Cimketipus cimke) {
        this.cimke = cimke;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getAlkoholFok() {
        return alkoholFok;
    }

    public Cimketipus getCimke() {
        return cimke;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Ital{" + "nev=" + nev + ", alkoholFok=" + alkoholFok + ", cimke=" + cimke + '}';
    }
    
    

}
    
    

