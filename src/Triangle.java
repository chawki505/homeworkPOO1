/**
 * Created by chawki on 01/10/16.
 */
public class Triangle extends Geometrie {

    public Triangle() {
    }

    public Triangle(double x, double y) {
        this.largeur = x;
        this.hauteur = y;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    private double diametre() {
        return Math.sqrt(Math.pow(this.getHauteur(), 2) + Math.pow(this.getLargeur(), 2));
    }

    @Override
    double perimetre() {
        return this.getLargeur() + this.getHauteur() + this.diametre();
    }

    @Override
    double surface() {
        return this.getHauteur() * this.getLargeur() / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nhauteur = " + this.getHauteur() + "\nlargeur = " + this.getLargeur() + "\ndiametre = " + this.diametre() + "\nPerimetre = " + this.perimetre() + "\nSurface = " + this.surface();

    }
}
