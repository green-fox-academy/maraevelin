import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
  public static void mainDraw(Graphics graphics) {

    int xC = 0;
    int yC = 0;

    for (int i = 0; i < 3 ; i++) {
      xC += 6;
      yC += 24;
      functionHorizontal(xC, yC, graphics);

    }
  }
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.
public static void functionHorizontal (int cX, int cY, Graphics graphics) {
  int r = (int) (Math.random() * 256);
  int g = (int) (Math.random() * 256);
  int b = (int) (Math.random() * 256);
  graphics.setColor(new Color(r, g, b));
  graphics.drawLine(cX, cY, cX+50, cY);
}


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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