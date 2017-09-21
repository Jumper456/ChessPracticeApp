import javax.swing.*;

public class ChessboardForm {

    private JFrame myFrame;
    private JPanel boardMainPan;
    private JEditorPane editorPane1;

    public ChessboardForm() {
        myFrame = new JFrame("ChessBoard");
        myFrame.setContentPane(new ChessboardForm().boardMainPan);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
