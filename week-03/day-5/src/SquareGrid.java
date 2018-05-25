import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics){
    drawSquareGrid(WIDTH/4, WIDTH/4, WIDTH/2, graphics);
  }

  private static void drawSquareGrid(int x, int y, int size, Graphics graphics) {
    if (size == WIDTH / 32) {
      graphics.drawRect(0, 0, 0, 0);
    } else {
      graphics.drawRect(x, y, size, size);
      drawSquareGrid(x / 2, y / 2, size / 2, graphics);
      drawSquareGrid((WIDTH / 2 + x / 2 ), (y / 2),size / 2, graphics);
      drawSquareGrid((x / 2 ), (HEIGHT / 2 + y / 2),size / 2, graphics);
      drawSquareGrid((WIDTH / 2 + x / 2 ), (HEIGHT / 2 + y / 2),size / 2, graphics);
//      drawSquareGrid(x / 2, y / 2, size / 2, graphics);
//      drawSquareGrid(x / 2, y / 2, size / 2, graphics);


//      drawSquareGrid(coordinate / 2, size / 2, graphics);
    }
  }

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