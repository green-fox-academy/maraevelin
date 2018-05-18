import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters_Beta {
  public static void mainDraw (Graphics graphics) {
    int partition = 2;
    int size = HEIGHT/partition;

    int repetition = 12;
    int frequency = size /repetition;
    int xConstantDistance = 5;
    int yConstantDistance = 5;

    int x1Green = xConstantDistance;
    int y1Green = frequency;
    int x2Green = frequency;
    int y2Green = size-x1Green;

    int x1Purple = frequency;
    int y1Purple = yConstantDistance;
    int x2Purple = size - y1Purple;
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

      }

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