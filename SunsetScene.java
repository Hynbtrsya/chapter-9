import javax.swing.*;
import java.awt.*;

public class SunsetScene extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call super.paintComponent(g) to ensure proper painting

        // Draw the sky (light blue)
        g.setColor(new Color(135, 206, 235)); // Sky blue color
        g.fillRect(0, 0, getWidth(), getHeight() / 2); // Upper half of the screen for the sky

        // Draw the ground (dark green)
        g.setColor(new Color(34, 139, 34)); // Forest green color
        g.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2); // Bottom half for the ground

        // Draw the sun (yellow-orange gradient)
        g.setColor(new Color(255, 140, 0)); // Orange sun color
        g.fillOval(200, 100, 150, 150); // Sun position and size

        // Draw clouds (white)
        g.setColor(Color.WHITE);
        g.fillOval(100, 50, 120, 60); // Cloud 1
        g.fillOval(350, 70, 150, 80); // Cloud 2
        g.fillOval(500, 30, 130, 70); // Cloud 3

        // Draw mountains (dark gray)
        g.setColor(new Color(169, 169, 169)); // Dark gray color for mountains
        int[] xPoints = {0, 200, 400, 600};
        int[] yPoints = {getHeight() / 2, 150, 150, getHeight() / 2};
        g.fillPolygon(xPoints, yPoints, 4); // Mountain polygon

        // Draw the reflection of the sun on water
        g.setColor(new Color(255, 140, 0, 100)); // Semi-transparent reflection color
        g.fillOval(230, getHeight() / 2 + 50, 100, 100); // Reflection of the sun in water

        // Draw trees (brown trunks and green leaves)
        g.setColor(new Color(139, 69, 19)); // Tree trunk color
        g.fillRect(50, getHeight() / 2 + 60, 20, 100); // Tree 1 trunk
        g.fillRect(500, getHeight() / 2 + 60, 20, 100); // Tree 2 trunk

        // Draw the tree leaves (green)
        g.setColor(Color.GREEN);
        g.fillOval(30, getHeight() / 2 + 30, 60, 60); // Tree 1 leaves
        g.fillOval(480, getHeight() / 2 + 30, 60, 60); // Tree 2 leaves
    }

    public static void main(String[] args) {
        // Set up the JFrame to display the JPanel
        JFrame frame = new JFrame("Sunset Scene");
        SunsetScene panel = new SunsetScene();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Set the size for the window
        frame.add(panel);  // Add the panel to the frame
        frame.setVisible(true); // Display the window
    }
}
