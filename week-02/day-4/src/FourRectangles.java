import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){

    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);

    int xOfRect = 10;
    int yOfRect = 10;
    int widthOfRect = 10;
    int heigthOfRect = 10;


    for (int i = 0; i < 4; i++) {
      xOfRect += xOfRect;
      yOfRect += yOfRect;
      widthOfRect += widthOfRect;
      heigthOfRect += heigthOfRect;

      graphics.setColor(new Color(r, g, b));
      graphics.fillRect(xOfRect, yOfRect, widthOfRect, heigthOfRect);
    }

    // draw four different size and color rectangles.
    // avoid code duplication.


  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}