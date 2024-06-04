package onderdelen.screen;

import onderdelen.Onderdeel;

public abstract class Screen extends Onderdeel {

    public Screen (int frequency, int ntsc, String type) {
        setName (String.format ("%dHz %s Paneel (1920 x 1080), %d%% NTSC",
                                frequency, type, ntsc));
    }
}