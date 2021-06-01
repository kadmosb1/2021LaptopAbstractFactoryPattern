package factories.screen;

public abstract class Screen {

    private int frequency;
    private int ntsc;

    public Screen (int frequency, int ntsc) {
        this.frequency = frequency;
        this.ntsc = ntsc;
    }

    public int getFrequency () {
        return frequency;
    }

    public int getNTSC () {
        return ntsc;
    }

    public String getName () {
        return String.format ("%dHz FHD Paneel (1920 x 1080), %d%% NTSC", frequency, ntsc);
    }
}
