import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
  int size = 300;

  squareDrawing(size, graphics);
  }
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.


  public static void squareDrawing (int squareSize, Graphics graphics) {

    squareSize = 100;

    int widthOfRect = squareSize;
    int heightOfRect = squareSize;

    for (int i = 0; i < 3; i++) {

      squareSize -= 25;

      int x = (WIDTH/2)-(squareSize/2);
      int y = (HEIGHT/2)-(squareSize/2);

      graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
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