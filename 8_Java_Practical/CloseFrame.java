import java.awt.*;
import java.awt.event.*;
public class CloseFrame extends Frame {
    public CloseFrame() {
        // Add a window listener to handle the window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Change the color of the frame
                setBackground(Color.RED);
                // Set the visibility of the frame to true
                setVisible(true);
            }
        });
        // Set the size and make the frame visible
        setSize(400, 400);
        setVisible(true);}
    public static void main(String[] args) {
        new CloseFrame();
    }
}
