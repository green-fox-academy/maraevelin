import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw (Graphics graphics) {

    int repetition = 12;
    int constantDistance = 5;
    int frequency = HEIGHT/repetition;

    int x1Green = constantDistance;
    int y1Green = frequency;
    int x2Green = frequency;
    int y2Green = HEIGHT-x1Green;

    int x1Purple = frequency;
    int y1Purple = constantDistance;
    int x2Purple = WIDTH - y1Purple;
    int y2Purple = frequency;


    for (int i = 0; i < repetition; i++) {
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