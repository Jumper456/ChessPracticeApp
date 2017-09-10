import static java.lang.System.*;

//klasa która agreguje pole gry, graczy itd
public class Game {
    //TODO kolekcja graczy
    //TODO pole gry
    //TODO inicjalizacja pola gry

    private ChessBoard myBoard;

    public ChessBoard getMyBoard() {
        return myBoard;
    }

    public Game() {
        out.println("Konstruktor bezparametrowy Game");
        myBoard = new ChessBoard();
    }
}
