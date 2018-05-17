import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics) {


    int size = WIDTH;
    int numberOfColor = (int)(Math.random( )*256);

    for (int i = 0; i < 7; i++) {
      functionRainbow(size, numberOfColor, graphics);
    }

  }
  // Create a square drawing function that takes 2 parameters:
  // The square size, and the fill color,
  // and draws a square of that size and color to the center of the canvas.
  // Create a loop that fills the canvas with rainbow colored squares.


  public static void functionRainbow (int squareSize, int codeColor, Graphics graphics) {


    for (int i = 0; i < 7; i++) {

      squareSize -= 25;

      int x = (WIDTH/2)-(squareSize/2);
      int y = (HEIGHT/2)-(squareSize/2);

      graphics.setColor(new Color(codeColor, (int)(Math.random( )*256), (int)(Math.random( )*256)));
      graphics.fillRect(x, y, squareSize, squareSize);

    }

  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}