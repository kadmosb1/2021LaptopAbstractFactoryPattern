package laptops;

import onderdelen.cpu.*;
import onderdelen.factories.LaptopFactory;
import onderdelen.graphics.*;
import onderdelen.screen.Screen;

public abstract class Laptop {

    private final String name;
    private final CPU cpu;
    private final GraphicsCard gc;
    private final Screen screen;

    public Laptop (String name, LaptopFactory factory) {
        this.name = name;
        this.cpu = factory.createCPU ();
        this.gc = factory.createGraphicsCard ();
        this.screen = factory.createScreen ();
    }

    public String getName () {
        return name;
    }

    public void toonSamenstelling () {
        System.out.printf ("%n==============================%n" +
                           "= %s%n", getName ());
        cpu.toonGegevens ();
        gc.toonGegevens ();
        screen.toonGegevens ();
        System.out.printf ("==============================%n%n");
    }
}