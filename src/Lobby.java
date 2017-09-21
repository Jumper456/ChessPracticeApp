import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;


//Klasa zarządzająca grami - umożliwia zdefiniowanie graczy, wybór typu gry, uruchomienie gry
public class Lobby {
    Game myGame;
    LobbyForm myLobby;
    JFrame myFrame;

    Lobby(){
        out.println("Konstruktor bezparametrowy Lobby");
        myLobby = new LobbyForm();
        myLobby.showForm();

        //myGame = new Game();
    }
}
