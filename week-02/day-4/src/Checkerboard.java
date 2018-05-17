import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    int sizePattern = 32;
    int numbersPattern = WIDTH/sizePattern;
    int dynamicCoordinateOfBlack = 0;
    int dynamicCoordinateOfWhite = sizePattern;
    int zeroCoordinate = 0;

    for (int i = 0; i < WIDTH/sizePattern; i++) {
      for (int j = 0; i < HEIGHT/sizePattern; i++) {

        graphics.setColor(Color.black);
        graphics.fillRect(dynamicCoordinateOfBlack, zeroCoordinate, sizePattern, sizePattern);

        dynamicCoordinateOfWhite = dynamicCoordinateOfBlack + sizePattern;
        dynamicCoordinateOfBlack = dynamicCoordinateOfWhite + sizePattern;

        graphics.setColor(Color.black);
        graphics.fillRect(dynamicCoordinateOfBlack, zeroCoordinate, sizePattern, sizePattern);
        graphics.setColor(Color.white);
        graphics.fillRect(dynamicCoordinateOfWhite, zeroCoordinate, sizePattern, sizePattern);

      }

    }

  }

    // Fill the canvas with a checkerboard pattern.


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