import laptop.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private ArrayList<Laptop> laptops;

    public Shop () {
        laptops = new ArrayList<> ();
        laptops.add (new Optimus ());
        laptops.add (new Elimina ());
        laptops.add (new Defiance ());
    }

    public Laptop getLaptop () {

        int teller = 1;
        System.out.printf ("Welke laptop wil je samenstellen?%n%n");

        for (Laptop laptop : laptops) {
            System.out.printf ("%2d. %s%n", teller++, laptop.getName ());
        }

        System.out.printf ("%2d. Quit%n%nMaak uw keuze: ", teller);
        int keuze = new Scanner (System.in).nextInt ();

        if (keuze < teller) {
            return laptops.get (keuze - 1);
        }

        return null;
    }

    public void startMenu () {

        Laptop laptop = getLaptop ();

        while (laptop != null) {
            System.out.printf ("%n==============================%n= %s%n%s%n==============================%n%n",
                               laptop.getName (), laptop.getSamenstelling ());
            laptop = getLaptop ();
        }
    }

    public static void main (String [] args) {
        new Shop ().startMenu ();
    }
}
