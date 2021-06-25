package fr.limayrac.brpi.modele;

public class Dictionnaire {

    private String fichier;
    private String liste;

    public Dictionnaire(String fichier, String liste) {
        this.fichier = fichier;
        this.liste = liste;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getListe() {
        return liste;
    }

    public void setListe(String liste) {
        this.liste = liste;
    }
}
