import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 854;
        int boardHeight = 480;

        JFrame frame = new JFrame("FlappyBird");
        // frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardWidth, boardHeight);
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}