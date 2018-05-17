import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    int a = 320/8;
    int b = 320/2;

    graphics.setColor(Color.red);
    graphics.drawLine(a, a, b, a);
    graphics.setColor(Color.green);
    graphics.drawLine(a, a, a, b);
    graphics.setColor(Color.blue);
    graphics.drawLine(b, a, b, b);
    graphics.setColor(Color.black);
    graphics.drawLine(a, b, b, b);
    // Draw a box that has different colored lines on each edge.
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