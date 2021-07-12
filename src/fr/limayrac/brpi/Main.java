package fr.limayrac.brpi;
import fr.limayrac.brpi.modele.Grille;
import fr.limayrac.brpi.util.File;

public class Main {

    public static void main(String[] args) {
        Grille grille = new Grille();
        grille.createGrille();
        grille.displayGrille();
        grille.setDefinition();
        grille.displayGrille();
        System.out.print("\n");
        grille.setDefinition();
        grille.displayGrille();
        System.out.print("\n");
        grille.setDefinition();
        grille.displayGrille();
        System.out.print("\n");
    }
}
