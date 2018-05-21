import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {
    int halfCanvas = WIDTH / 2;
    int repetition = halfCanvas / 10;
    int distance = 10;
    int distanceX = 3;

    graphics.setColor(new Color(250, 50, 150));
    for (int i = 0; i < repetition; i++) {
      graphics.drawLine(
          halfCanvas + distance * i,
          halfCanvas,
          halfCanvas,
          halfCanvas * 2 - distance * i);
    }
    graphics.setColor(new Color(50, 250, 150));
    for (int j = 0; j < repetition; j++) {
      graphics.drawLine(
          distance * j + halfCanvas,
          0 + halfCanvas,
          halfCanvas,
          distance * j);
    }
    graphics.setColor(new Color(50, 150, 250));
    for (int k = 0; k < repetition; k++) {
      graphics.drawLine(
          0 + halfCanvas,
          distance * k + halfCanvas,
          distance * k,
          halfCanvas);
    }
    graphics.setColor(new Color(250, 150, 250));
    for (int n = 0; n < repetition; n++) {
      graphics.drawLine(
          distance * n,
          halfCanvas,
          halfCanvas,
          halfCanvas - distance * n);
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