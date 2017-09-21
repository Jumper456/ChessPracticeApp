import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyForm {
    private JButton surpriseButton;
    private JPanel panelMainLobby;
    private JButton exitButton;
    private JButton szachownicaButton;
    private JFrame myFrame;
    private ChessBoard myChessBoard;


    public LobbyForm() {
        szachownicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Tu będzie szachownica!!!");
                myChessBoard = new ChessBoard();
            }
        });
        surpriseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Niespodzianka!!!");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Jeszcze nie wiem jak zamknąć okno :( naciśnij X w prawym górnym rogu");
            }
        });
    }

    public void showForm(){
        myFrame = new JFrame("Chess");
        myFrame.setContentPane(new LobbyForm().panelMainLobby);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setSize(500,500);
        myFrame.setVisible(true);

    }
}
