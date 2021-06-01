package laptop;

import factories.cpu.*;
import factories.LaptopFactory;
import factories.graphics.*;
import factories.screen.Screen;

public abstract class Laptop {

    private String name;
    private ICPU cpu;
    private IGraphicsCard gc;
    private Screen screen;

    public Laptop (String name, LaptopFactory factory) {
        this.name = name;
        this.cpu = factory.createCPU ();
        this.gc = factory.createGraphicsCard ();
        this.screen = factory.createScreen ();
    }

    public String getSamenstelling () {
        return String.format ("= CPU: %s%n= Graphics Card: %s%n= Screen: %s",
                              cpu.getName(), gc.getName(), screen.getName ());
    }

    public String getName () {
        return name;
    }
}
