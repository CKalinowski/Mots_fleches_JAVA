package fr.limayrac.brpi.modele;

public class Mot {

    private String contenu;
    private int longueur;

    public Mot(String contenu, int longueur) {
        this.contenu = contenu;
        this.longueur = longueur;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
