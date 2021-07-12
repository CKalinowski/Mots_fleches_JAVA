package fr.limayrac.brpi;
import modele.Grille;
import util.File;
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

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
