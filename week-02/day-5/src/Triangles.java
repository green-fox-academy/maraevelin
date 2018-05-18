//import javax.swing.*;
//
//import java.awt.*;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class Triangles {
//  public static void mainDraw(Graphics graphics) {
//    int nOfTriangle = 3;
//    int height = 32;
//
//    int x1 = WIDTH/2;
//    int x2 = - height/2;
//    int x3 = + height/2;
//
//    int y1 = 0;
//    int y2 = height;
//    int y3 = height;
//
//
//    for (int i = 0; i < 5; i++) {
//      for (int j = 0; j < 5; j++) {
//        int xOfTriangle[] = {x1, x1+x2, x1+x3};
//        int yOfTriangle[] = {y1, y2, y3};
//
//        graphics.drawPolygon(xOfTriangle, yOfTriangle, nOfTriangle);
//      }
//
//      x1 = -x1;
//      y1 += height + height;
//
//    }
//  }
//
//  // Don't touch the code below
//  static int WIDTH = 320;
//  static int HEIGHT = 320;
//
//  public static void main(String[] args) {
//    JFrame jFrame = new JFrame("Drawing");
//    jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
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