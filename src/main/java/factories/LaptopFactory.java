package factories;

import factories.cpu.*;
import factories.screen.*;
import factories.graphics.*;

public abstract class LaptopFactory {

    public static final OptimusFactory OPTIMUS = new OptimusFactory ();
    public static final EliminaFactory ELIMINA = new EliminaFactory ();
    public static final DefianceFactory DEFIANCE = new DefianceFactory ();

    public abstract ICPU createCPU ();
    public abstract IGraphicsCard createGraphicsCard ();
    public abstract Screen createScreen ();
}