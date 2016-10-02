/**
 * Created by chawki on 01/10/16.
 */
public class Cercle extends Geometrie {


    public Cercle() {
    }

    public Cercle(double x) {
        this.rayon = x;
    }

    //getters and setters rayon

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    private double diametre(double x) {
        return this.rayon + this.rayon;
    }

    @Override
    double perimetre() {
        return diametre(this.getRayon()) * Math.PI;
    }

    @Override
    double surface() {
        return(this.getRayon() * this.getRayon() * Math.PI);
    }

    @Override
    public String toString() {
        return super.toString() + "\nrayon = " + this.getRayon() + "\ndiametre = " + this.diametre(this.getRayon()) + "\nPerimetre = " + this.perimetre() + "\nSurface = " + this.surface();
    }
}
