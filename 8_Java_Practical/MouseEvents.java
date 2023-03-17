import java.awt.*;
import java.awt.event.*;
public class MouseEvents extends Frame implements MouseListener, MouseMotionListener {
    private TextField mouseClickPosition;
    public MouseEvents() {
        mouseClickPosition = new TextField(20);
        add(mouseClickPosition, BorderLayout.NORTH);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        mouseClickPosition.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseMoved(MouseEvent e) {
        mouseClickPosition.setText("Mouse moved at (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseDragged(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public static void main(String args[]) {
        new MouseEvents();
    }
}
