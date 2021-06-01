package factories;

import factories.cpu.*;
import factories.graphics.*;
import factories.screen.*;

public class DefianceFactory extends LaptopFactory {

    @Override
    public ICPU createCPU () {
        return new CPU_I7_11800 ();
    }

    @Override
    public IGraphicsCard createGraphicsCard () {
        return new RTX3050 ();
    }

    @Override
    public Screen createScreen () {
        return new FHD240 ();
    }
}
