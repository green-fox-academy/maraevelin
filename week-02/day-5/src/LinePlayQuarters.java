import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw (Graphics graphics) {

    int dividedInto4 = WIDTH / 2;
    int dividedInto16 = WIDTH / 8;
    int dividedinto64 = WIDTH / 32;

    int repetition = 12;
    int frequency = dividedInto4 / repetition;
    int xDistance = 5;
    int yDistance = 5;

    int x1Green = xDistance;
    int y1Green = frequency;
    int x2Green = frequency;
    int y2Green = dividedInto4 - x1Green;

    int x1Purple = frequency;
    int y1Purple = yDistance;
    int x2Purple = dividedInto4 - y1Purple;
    int y2Purple = frequency;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < repetition; j++) {
        graphics.setColor(Color.green);
        graphics.drawLine(x1Green, y1Green, x2Green, y2Green);

        graphics.setColor(Color.magenta);
        graphics.drawLine(x1Purple, y1Purple, x2Purple, y2Purple);

        y1Green += frequency;
        x2Green += frequency;

        x1Purple += frequency;
        y2Purple += frequency;

        xDistance = xDistance + 320 / 2;
      }

      yDistance = yDistance + 320 / 2;

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