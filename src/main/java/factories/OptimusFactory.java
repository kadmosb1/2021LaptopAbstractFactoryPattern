package factories;

import factories.cpu.*;
import factories.graphics.*;
import factories.screen.*;

public class OptimusFactory extends LaptopFactory {

    @Override
    public ICPU createCPU () {
        return new CPU_I5 ();
    }

    @Override
    public IGraphicsCard createGraphicsCard () {
        return new GTX1650 ();
    }

    @Override
    public Screen createScreen () {
        return new FHD120 ();
    }
}
