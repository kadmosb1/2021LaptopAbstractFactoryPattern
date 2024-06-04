package onderdelen.factories;

import onderdelen.cpu.*;
import onderdelen.screen.*;
import onderdelen.graphics.*;

public abstract class LaptopFactory {

    public static final LaptopFactory OPTIMUS = new OptimusFactory ();
    public static final LaptopFactory ELIMINA = new EliminaFactory ();
    public static final LaptopFactory DEFIANCE = new DefianceFactory ();

    public abstract CPU createCPU ();
    public abstract GraphicsCard createGraphicsCard ();
    public abstract Screen createScreen ();
}