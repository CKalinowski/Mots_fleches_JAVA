package fr.limayrac.brpi;
import fr.limayrac.brpi.modele.Grille;
import fr.limayrac.brpi.util.File;

public class Main {

    public static void main(String[] args) {
        Grille grille = new Grille();
        grille.creategrille();
        grille.displaygrille();
        grille.setDefinition();
        grille.displaygrille();
        System.out.print("\n");
        grille.setDefinition();
        grille.displaygrille();
        System.out.print("\n");
        grille.setDefinition();
        grille.displaygrille();
        System.out.print("\n");
    }
}
