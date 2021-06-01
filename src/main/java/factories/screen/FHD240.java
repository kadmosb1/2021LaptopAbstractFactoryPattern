package factories.screen;

public class FHD240 extends Screen {

    public FHD240 () {
        super (240, 72);
    }

    @Override
    public String getName () {
        return String.format ("%d%% NTSC %dHz LED-Paneel (1920 x 1080)", getNTSC (), getFrequency ());
    }

}
