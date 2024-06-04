package menu;

import laptops.Laptop;

public class Menukeuze {

    private final int nummer;
    private final String titel;
    IActie actie;

    public Menukeuze (int nummer, String titel, IActie actie) {
        this.nummer = nummer;
        this.titel = titel;
        this.actie = actie;
    }
    public Menukeuze (int nummer) {
        this (nummer, "Exit", new ActieExit ());
    }

    public Menukeuze (int nummer, Laptop laptop) {
        this (nummer, laptop.getName (), new ActieLaptop (laptop));
    }

    public void toonMenukeuze () {
        System.out.printf ("%d. %s%n", nummer, titel);
    }

    public IActie getActie () {
        return this.actie;
    }
}