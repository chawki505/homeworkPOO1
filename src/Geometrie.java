/**
 * Created by chawki on 01/10/16.
 */
public abstract class Geometrie {

    protected double rayon;

    protected double longeur;
    protected double largeur;
    protected double hauteur;

    protected double angle;
    protected double tete;


    abstract double perimetre();

    abstract double surface();

    @Override
    public String toString() {
        return "Geometrie de type " + this.getClass();
    }


}
