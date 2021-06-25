package fr.limayrac.brpi.modele;

public class Case {
    private int abscisse = 0;
    private int ordonne = 0;
    private int type = 0;

    public Case(int abscisse, int ordonne, int type) {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
        this.type = type;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}