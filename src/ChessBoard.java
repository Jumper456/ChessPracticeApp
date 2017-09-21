import static java.lang.System.*;
import javax.swing.*;

public class ChessBoard extends Board {
    private ChessboardForm myChessboardForm;

    public ChessBoard() {
        out.println("Konstruktor bezparametrowy ChessBoard");
        myChessboardForm = new ChessboardForm();
    }
}
