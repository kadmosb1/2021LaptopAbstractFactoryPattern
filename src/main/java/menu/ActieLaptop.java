package menu;

import laptops.Laptop;

public class ActieLaptop implements IActie {

    Laptop laptop;

    public ActieLaptop (Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void voerActieUit() {
        laptop.toonSamenstelling ();
    }
}
