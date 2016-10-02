/**
 * Created by chawki on 01/10/16.
 */
public class Main {

    public static void main(String[] args) {

        Cercle c = new Cercle(1);
        Rectangle r = new Rectangle(10, 5);
        Carre ca = new Carre(2);
        Triangle t = new Triangle(2, 2);
        System.out.println("\n"+c.toString());
        System.out.println("\n"+r.toString());
        System.out.println("\n"+ca.toString());
        System.out.println("\n"+t.toString());

    }
}
