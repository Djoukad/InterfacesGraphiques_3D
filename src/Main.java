import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Main {
    private JFrame frame;
    
    public static final int FRAME_WIDTH = 1168;
    public static final int FRAME_HEIGHT = 800;

    public void display() {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Main() {
        createView();
    }

    private void createView() {
        frame = new JFrame("MAP by MDT");
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().display();
            }
        });
    }

}