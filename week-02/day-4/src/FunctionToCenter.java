import sun.font.FontRunIterator;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int x1 = 0;
    int y1 = 0;

    functionToCenter (x1, y1, graphics);
  }

  public static void functionToCenter(int x1, int y1, Graphics graphics) {

    int x2 = WIDTH/2;
    int y2 = HEIGHT/2;

    int distance = 20;
    int frequency = WIDTH/distance;

    for (int i = 0; i < frequency; i++) {
      graphics.setColor(new Color(50, 200, 250));
      graphics.drawLine(x1, y1, x2, y2);

      x1 += distance;
    }

    for (int i = 0; i < frequency; i++) {
      graphics.setColor(new Color(250, 50, 150));
      graphics.drawLine(x1, y1, x2, y2);

      y1 += distance;

    }

    for (int i = 0; i < frequency; i++) {
      graphics.setColor(new Color(50, 200, 250));
      graphics.drawLine(x1, y1, x2, y2);

      x1 -= distance;
    }

    for (int i = 0; i < frequency; i++) {
      graphics.setColor(new Color(250, 50, 150));
      graphics.drawLine(x1, y1, x2, y2);

      y1 -= distance;

    }

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}