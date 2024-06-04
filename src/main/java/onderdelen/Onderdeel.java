package onderdelen;

public abstract class Onderdeel {

    private String name;

    protected void setName (String name) {
        this.name = name;
    }

    protected String getName () {
        return this.name;
    }

    public void toonGegevens () {
        System.out.printf ("= %s%n", getName ());
    }
}