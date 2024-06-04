package onderdelen.factories;

import onderdelen.cpu.*;
import onderdelen.graphics.*;
import onderdelen.screen.*;

public class DefianceFactory extends LaptopFactory {

    @Override
    public CPU createCPU () {
        return new CPU_I7_11800 ();
    }

    @Override
    public GraphicsCard createGraphicsCard () {
        return new RTX3050 ();
    }

    @Override
    public Screen createScreen () {
        return new FHD240 ();
    }
}