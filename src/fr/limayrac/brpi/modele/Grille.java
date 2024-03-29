package fr.limayrac.brpi.modele;

import fr.limayrac.brpi.util.File;
import java.util.Scanner;


public class Grille
{
    int hauteur;
    int largeur;
    Case grille[][];
    Definition definitions[][];


    /**
     * Cree la grille n x n
     */
    public void createGrille()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes dans la grille: ");
        hauteur = sc.nextInt();

        System.out.print("Entrez le nombre de colonne dans la grille: ");
        largeur = sc.nextInt();

        grille = new Case[largeur][hauteur];

        for(int y = 0; y < hauteur; y++) {
            for(int x = 0; x < largeur; x++) {
                grille[x][y] = new Case();
                grille[x][y].setLabel(" ");
            }
        }
    }


    /**
     * fonction qui affiche la grille
     */
    public void displayGrille()
    {
        for(int y = 0; y < hauteur; y++) {
            for(int x = 0; x < largeur; x++) {
                System.out.printf(" %s |", grille[x][y].getLabel());
            }
            System.out.print("\n");
        }
    }


    /**
     * Place une definition dans la grille
     */
    public void setDefinition()
    {
        Scanner sc = new Scanner(System.in);
        int x, y;

        do {
            System.out.print("Position X (horizontal) de la definition : ");
            x = sc.nextInt() - 1;

            System.out.print("Position Y (vertical) de la definition: ");
            y = sc.nextInt() - 1;

            //Position non comprise dans la grille
            if(x == grille[0].length - 1 && y == grille.length - 1) {
                System.out.println("Position invalide ! Choisir une autre position");
            }
        }while(x == grille[0].length - 1 && y == grille.length - 1);


        grille[x][y].setLabel("D");
        displayGrille();

        choseDirection(x, y);
    }


    /**
     * Permet à l'utilisateur de choisir une direction pour la definition
     * @param definitionX Integer definitionX
     * @param definitionY Integer definitionY
     */
    public void choseDirection(int definitionX, int definitionY)
    {
        Scanner sc = new Scanner(System.in);
        int direction;

        do {
            System.out.println("Choisissez la direction du mot :");
            System.out.println("[0] Horizontal direct");
            System.out.println("[1] Horizontal indirect");
            System.out.println("[2] Vertical direct");
            System.out.println("[3] Vertical indirect");

            direction = sc.nextInt();
        }while(!countCasesVides(direction, definitionX, definitionY));
    }


    /**
     * Compte le nombre de cases vide sur le chemin choisi pour une definition
     * @param direction Integer direction
     * @param definitionX Integer definitionX
     * @param definitionY Integer definitionY
     * @return boolean result
     */
    public boolean countCasesVides(int direction, int definitionX, int definitionY) {
        int i = definitionX, j = definitionY, totalCasesVides = 0;
        boolean result = false;
        String caseCroisee = "";

        switch (direction) {
            case 0 -> {
                i++;
                if (i == grille[0].length || grille[i][j].getLabel().equals("D")) {
                    System.out.println("Il n'y a pas de cases libre en horizontal direct");
                    break;
                }
                while (i < grille[0].length && !grille[i][j].getLabel().equals("D")) {
                    if(grille[i][j].getLabel().equals(" ")) {
                        caseCroisee = caseCroisee + ".";
                    } else {
                        caseCroisee = caseCroisee + grille[i][j].getLabel();
                    }
                    totalCasesVides++;
                    i++;
                }
                System.out.println("En horizontal direct il y a " + totalCasesVides + "\n");
                result = true;
            }
            case 1 -> {
                j++;
                if (j == grille.length || grille[i][j].getLabel().equals("D")) {
                    System.out.println("Il n'y a pas de cases libre en horizontal indirect");
                    break;
                }
                while (i < grille[0].length && !grille[i][j].getLabel().equals("D")) {
                    if(grille[i][j].getLabel().equals(" ")) {
                        caseCroisee = caseCroisee + ".";
                    } else {
                        caseCroisee = caseCroisee + grille[i][j].getLabel();
                    }
                    totalCasesVides++;
                    i++;
                }
                System.out.println("En horizontal indirect il y a " + totalCasesVides + "\n");
                result = true;
            }
            case 2 -> {
                j++;
                if (j == grille.length || grille[i][j].getLabel().equals("D")) {
                    System.out.println("Il n'y a pas de cases libre en vertical direct");
                    break;
                }
                while (j < grille.length && !grille[i][j].getLabel().equals("D")) {
                    if(grille[i][j].getLabel().equals(" ")) {
                        caseCroisee = caseCroisee + ".";
                    } else {
                        caseCroisee = caseCroisee + grille[i][j].getLabel();
                    }
                    totalCasesVides++;
                    j++;
                }
                System.out.println("En vertical direct il y a " + totalCasesVides + "\n");
                result = true;
            }
            case 3 -> {
                i++;
                if (i == grille[0].length || grille[i][j].getLabel().equals("D")) {
                    System.out.println("Il n'y a pas de cases libre en vertical indirect");
                    break;
                }
                while (j < grille.length && !grille[i][j].getLabel().equals("D")) {
                    if(grille[i][j].getLabel().equals(" ")) {
                        caseCroisee = caseCroisee + ".";
                    } else {
                        caseCroisee = caseCroisee + grille[i][j].getLabel();
                    }
                    totalCasesVides++;
                    j++;
                }
                System.out.println("En vertical indirect il y a " + totalCasesVides + "\n");
                result = true;
            }
            default -> result = false;
        }

        System.out.println(caseCroisee);
        addWord(direction, definitionX, definitionY, totalCasesVides, caseCroisee);
        return result;
    }


    /**
     * Ajoute une mot dans la grille
     * @param direction Integer direction
     * @param positionX Integer positionX
     * @param positionY Integer positionY
     * @param nbEmptyCases Integer nbEmptyCases
     * @param caseCroisee String caseCroisee
     */
    public void addWord(int direction, int positionX, int positionY, int nbEmptyCases, String caseCroisee) {
        File dictionnaire = new File();
        String word = dictionnaire.getRandomWordWithLetter(caseCroisee, nbEmptyCases);

        switch (direction) {
            case 0 -> {
                positionX++ ;
                for (int i = 0; i < word.length(); i++) {
                    grille[positionX][positionY].setLabel(Character.toString(word.charAt(i)));
                    positionX++;
                }
            }
            case 1 -> {
                positionY++ ;
                for (int i = 0; i < word.length(); i++) {
                    grille[positionX][positionY].setLabel(Character.toString(word.charAt(i)));
                    positionX++;
                }
            }
            case 2 -> {
                positionY++ ;
                for (int i = 0; i < word.length(); i++) {
                    grille[positionX][positionY].setLabel(Character.toString(word.charAt(i)));
                    positionY++;
                }
            }
            case 3 -> {
                positionX++ ;
                for (int i = 0; i < word.length(); i++) {
                    grille[positionX][positionY].setLabel(Character.toString(word.charAt(i)));
                    positionY++;
                }
            }
        }
    }
}

