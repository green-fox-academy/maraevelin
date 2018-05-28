//import javax.swing.*;
//
//import java.awt.*;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class SierpinskyCarpet {
//  public static void mainDraw(Graphics graphics) {
//    graphics.setColor(Color.white);
//    graphics.fillRect(0, 0, WIDTH, HEIGHT);
//    drawSierpinskyCarpet(WIDTH / 3, HEIGHT / 3, HEIGHT / 3, graphics);
//  }
//
//  public static void drawSierpinskyCarpet(int x, int y, int size, Graphics graphics) {
//  }
//
////  private static void drawSierpinskyCarpet(int x, int y, int size, Graphics graphics) {
////    if (size == 0) {
////      graphics.drawRect(0, 0, 0, 0);
////    } else {
////      graphics.setColor(Color.black);
////      graphics.fillRect(x, y, size, size);
////      drawSierpinskyCarpet(size / 3, size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(WIDTH / 3 + size / 3, size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(WIDTH * 2 / 3 + size / 3, size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(size / 3, HEIGHT / 3 + size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(size / 3, HEIGHT * 2 / 3 + size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(WIDTH / 3 + size / 3, HEIGHT / 3 + size/3, size / 3, graphics);
////      drawSierpinskyCarpet(WIDTH / 3 + size / 3, HEIGHT * 2 / 3 + size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(WIDTH * 2 / 3 + size / 3, HEIGHT * 2 / 3 + size / 3, size / 3, graphics);
////      drawSierpinskyCarpet(WIDTH * 2 / 3 + size / 3, HEIGHT / 3 + size / 3, size / 3, graphics);
//
////      drawSierpinskyCarpet(size/3, size/3, size / 3, graphics);
//
//  static int WIDTH = 320;
//  static int HEIGHT = 320;
//
//  public static void main(String[] args) {
//    JFrame jFrame = new JFrame("Drawing");
//    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
//    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//    jFrame.add(new ImagePanel());
//    jFrame.setLocationRelativeTo(null);
//    jFrame.setVisible(true);
//  }
//
//  static class ImagePanel extends JPanel {
//    @Override
//    protected void paintComponent(Graphics graphics) {
//      super.paintComponent(graphics);
//      mainDraw(graphics);
//    }
//  }
//}