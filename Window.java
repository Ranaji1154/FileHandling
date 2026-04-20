import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements MouseListener {
    

    Window() {
        JButton start = new JButton("Start");
        start.addMouseListener(this);

        this.setSize(50, 70);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(start);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            // frame = new File("Frame.java"); // file in same folder
            // if (frame.exists()) {
            //     try {
            //         // Open with system default editor
            //         java.awt.Desktop.getDesktop().open(frame);
            //     } catch (IOException ex) {
            //         ex.printStackTrace();
            //     }
            // } else {
            //     System.out.println("Frame.java not found.");
            // }
            new Frame().setVisible(true);
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
