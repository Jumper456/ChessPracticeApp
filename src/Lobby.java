import static java.lang.System.*;

//Klasa zarządzająca grami - umożliwia zdefiniowanie graczy, wybór typu gry, uruchomienie gry
public class Lobby {
    Game myGame;

    Lobby(){
        out.println("Konstruktor bezparametrowy Lobby");
        myGame = new Game();
    }
}
