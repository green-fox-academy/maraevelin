import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class StarryNight {
  // Draw the night sky:
  //  - The background should be black
  //  - The stars can be small squares
  //  - The stars should have random positions on the canvas
  //  - The stars should have random color (some shade of grey)


  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    int smallStar = 4;

    for (int i = 0; i < WIDTH*4; i++) {
      int randomShade = (int)(Math.random()*256);
      graphics.setColor(new Color(randomShade, randomShade, randomShade));
      graphics.fillRect((int)(Math.random()*WIDTH), (int)(Math.random()*WIDTH), smallStar, smallStar);
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