import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int position = 5;
    int partition = 8;
    patternDrawer(position, partition, graphics);
  }

  private static void patternDrawer(int position, int partition, Graphics graphics) {
    for (int canvasX = 0; canvasX < partition ; canvasX++) {
      for (int canvasY = 0; canvasY < partition ; canvasY++) {
        for (int repetition = 0; repetition <= WIDTH / position / partition ; repetition++) {
          lineDrawer(repetition, canvasX, canvasY, position, partition, graphics);
        }
      }
    }
  }

  private static void lineDrawer(int repetition, int xPosition, int yPosition, int position, int partition, Graphics graphics) {

    int frequency = repetition * position;
    int widthPartition = WIDTH / partition;
    int heightPartition = HEIGHT / partition;
    int xPositionCorrected = xPosition * widthPartition;
    int yPositionCorrected = yPosition * heightPartition;


    graphics.setColor(Color.blue);
    graphics.drawLine(
        xPositionCorrected + frequency,
        yPositionCorrected,
        widthPartition +  xPositionCorrected,
        yPositionCorrected + frequency
    );

    graphics.setColor(Color.green);
    graphics.drawLine(
        xPositionCorrected,
        yPositionCorrected + frequency,
        xPositionCorrected + frequency,
        yPositionCorrected + heightPartition

    );
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex02LinePlayQuarter");
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