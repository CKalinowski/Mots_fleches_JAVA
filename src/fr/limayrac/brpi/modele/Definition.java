package fr.limayrac.brpi.modele;

public class Definition {

    private String contenu;
    private String direction;

    public Definition(String contenu, String direction) {
        this.contenu = contenu;
        this.direction = direction;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
