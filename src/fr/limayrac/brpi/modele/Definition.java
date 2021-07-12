package fr.limayrac.brpi.modele;

//Déclaration de la classe
public class Definition extends Case
{
    String label;
    int x;
    int y;
    int direction;

    public Definition() {}

    //Récupération du Getter et Setter de la classe parente Case
    @Override
    public String getLabel()
    {
        return label;
    }

    @Override
    public void setLabel(String label)
    {
        this.label = label;
    }

    //Getter et Setter des variables de positions et de direction
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }
}
