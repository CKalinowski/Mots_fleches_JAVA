package fr.limayrac.brpi.modele;

public class ModeleGrille {
    // definir tableau d'objet case

    private Case tableau[][] = null ;
    private int hauteur = 0 ;
    private int largeur = 0 ;

    public ModeleGrille(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;

        tableau = new Case[hauteur][largeur]; // initialisation du tableau d'objet case
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
