import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip6A extends JFrame {
    private JLabel imageLabel;
    private ImageIcon imageIcon;
    private Timer timer;
    private boolean isVisible = true;

    public Slip6A() {
        setTitle("Blinking Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());

        // Load the image
        imageIcon = new ImageIcon("img.jpg");
        imageLabel = new JLabel(imageIcon);

        // Add the image label to the frame
        add(imageLabel);

        // Create a timer to toggle image visibility every 500 milliseconds (half a second)
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible;
                imageLabel.setVisible(isVisible);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Slip6A().setVisible(true);
            }
        });
    }
}
