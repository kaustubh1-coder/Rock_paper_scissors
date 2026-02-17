import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Rock_paper_scissorsGUI rockPaperScissorsGUI = new Rock_paper_scissorsGUI();

                rockPaperScissorsGUI.setVisible(true);
            }
        });

    }
}