package menu;

import laptops.Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static int eerstvolgendeMenukeuze;

    private final ArrayList<Menukeuze> menu;

    public Menu () {
        menu = new ArrayList<> ();
        eerstvolgendeMenukeuze = 1;
    }

    public void toonMenu () {

        while (true) {

            System.out.printf ("Je kunt de volgende laptops samenstellen:%n%n");

            for (Menukeuze keuze : menu) {
                keuze.toonMenukeuze ();
            }

            System.out.printf ("%nWelke laptop wil je samenstellen? ");

            int keuze = new Scanner(System.in).nextInt ();

            if (keuze <= menu.size ()) {
                menu.get (keuze - 1).getActie ().voerActieUit ();
            }
            else {
                System.out.printf ("%nKeuze is onbekend. Probeer het opnieuw.%n%n");
            }
        }
    }

    public void voegMenukeuzeToe (Laptop laptop) {
        menu.add (new Menukeuze (eerstvolgendeMenukeuze++, laptop));
    }

    public void voegExitMenukeuzeToe () {
        menu.add (new Menukeuze (eerstvolgendeMenukeuze++));
    }
}