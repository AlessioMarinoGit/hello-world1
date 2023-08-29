import java.awt.*; 
import javax.swing.*;

public class Window {
    private static void createWindow() {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel = new JLabel("I'm a label in the window?????", SwingConstants.CENTER);
    }
}