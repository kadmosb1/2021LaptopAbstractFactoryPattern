import laptops.*;
import menu.Menu;

public class Shop {

    public static void main (String [] args) {
        Menu menu = new Menu ();
        menu.voegMenukeuzeToe (new Optimus ());
        menu.voegMenukeuzeToe (new Elimina ());
        menu.voegMenukeuzeToe (new Defiance ());
        menu.voegExitMenukeuzeToe ();
        menu.toonMenu ();
    }
}