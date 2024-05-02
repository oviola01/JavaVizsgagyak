
package modell;

public class Bor extends Ital {
    
    private final String cukorTartalom;
    
    public Bor(String nev, String alkoholFok, Cimketipus cimke, String cukorTartalom) throws AlkoholFokException {
        super(nev, alkoholFok, cimke);
        this.cukorTartalom=cukorTartalom;
    }

    public String getCukorTartalom() {
        return cukorTartalom;
    }

    @Override
    public String toString() {
        return "Bor{" + "cukorTartalom=" + cukorTartalom + '}';
    }
    
    
}
