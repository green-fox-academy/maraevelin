import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {

    int x1 = 0;
    int y1 = 0;
    for (int i = 0; i < 3 ; i++) {
      x1 += 25;
      y1 += 120;
      fxGoToCenter(x1, y1, graphics);
    }
  }
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.


public static void fxGoToCenter(int xCoordinate, int yCoordinate, Graphics graphics) {

  Random random = new Random();
  int r = random.nextInt(256);
  int g = (int) (Math.random() * 256);
  int b = (int) (Math.random() * 256);
  graphics.setColor(new Color(r, g, b));
  graphics.drawLine(xCoordinate, yCoordinate, WIDTH/2, HEIGHT/2);

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