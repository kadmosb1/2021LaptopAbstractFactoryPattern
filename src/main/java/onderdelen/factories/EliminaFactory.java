package onderdelen.factories;

import onderdelen.cpu.*;
import onderdelen.graphics.*;
import onderdelen.screen.*;

public class EliminaFactory extends LaptopFactory {

    @Override
    public CPU createCPU () {
        return new CPU_I7_10870 ();
    }

    @Override
    public GraphicsCard createGraphicsCard () {
        return new RTX3050 ();
    }

    @Override
    public Screen createScreen () {
        return new FHD144 ();
    }
}