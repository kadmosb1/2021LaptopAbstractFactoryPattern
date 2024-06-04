package onderdelen.factories;

import onderdelen.cpu.*;
import onderdelen.graphics.*;
import onderdelen.screen.*;

public class OptimusFactory extends LaptopFactory {

    @Override
    public CPU createCPU () {
        return new CPU_I5 ();
    }

    @Override
    public GraphicsCard createGraphicsCard () {
        return new GTX1650 ();
    }

    @Override
    public Screen createScreen () {
        return new FHD120 ();
    }
}