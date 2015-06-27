import java.awt.BasicStroke;  
 import java.awt.Color;  
 import java.awt.Dimension;  
 import java.awt.Graphics2D;  
 import java.awt.RenderingHints;  
 import java.awt.image.BufferedImage;  
 import java.util.Random;  
   
 import javax.swing.ImageIcon;  
 import javax.swing.JFrame;  
 import javax.swing.JLabel;  
 import javax.swing.JScrollPane;  
 import javax.swing.SwingUtilities;  
   
 /**  
  * Program that generates a random fractal pattern  
  *   
  *   
  */  
 public class MainPanel extends JLabel {  
   
      public static void main(String args[]) {  
   
           SwingUtilities.invokeLater(new Runnable() {  
   
                public void run() {  
   
                     JFrame frame = new JFrame();  
                     frame.setMinimumSize(new Dimension(800, 600));  
                     frame.setContentPane(new JScrollPane(new MainPanel()));  
                     frame.setVisible(true);  
                }  
   
           });  
      }  
   
      public MainPanel() {  
   
           BufferedImage newFrameImg = new BufferedImage(1920, 1200,  
                     BufferedImage.TYPE_INT_ARGB);  
           this.setIcon(new ImageIcon(newFrameImg));  
   
           Graphics2D g2d = (Graphics2D) newFrameImg.getGraphics();  
           g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, // Anti-alias!  
                     RenderingHints.VALUE_ANTIALIAS_ON);  
   
           g2d.setColor(Color.black);  
           g2d.fillRect(0, 0, 1920, 1200);  
           generateTreeFractal(g2d, 1920 / 2, 1200 / 2, 10, 200);  
           // generateTreeFractal(g2d, 1920/2, 1200/2,6 , 60);  
   
      }  
   
      private static Color brightness(Color c, double scale) {  
           int r = Math.min(255, (int) (c.getRed() * scale));  
           int g = Math.min(255, (int) (c.getGreen() * scale));  
           int b = Math.min(255, (int) (c.getBlue() * scale));  
           return new Color(r, g, b);  
      }  
   
      private void generateTreeFractal(Graphics2D g2d, double x, double y,  
                double lineWidth, double lineLength) {  
   
           // multipliers for recursion. Must be between 0 and 1  
           // WARNING: the closer these are to 1 the longer the run time will be  
           final double LINE_WIDTH_MULTILIER = .87;  //was .8
           final double LINE_LENGTH_MULTIPLIER = .85;  //was .85
   
           // base case - we need to stop somewhere  
           // or else we'll get a stack overflow  
           if (lineWidth <= 1 || lineLength <= 2) {  
                return;  
           }  
   
           Random rand = new Random();  
   
           // compute random number of lines to draw. Play with this.  
           int numOfLinesToDraw = 1 + rand.nextInt(2);  //was 4 originally
   
           BasicStroke bs = new BasicStroke((float) lineWidth,  
                     BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);  
           g2d.setStroke(bs);  
           g2d.setColor(Color.GRAY);  
   
           // mess with the color  
           Color c = g2d.getColor();  
           // need a number from 0-1 to scale the color... I made this equation up  
           // it gives a cool shaded almost 3d effect. This should be played with  
           // to get better looking effects  
           c = brightness(  
                     c,  
                     Math.abs(Math.cos(x * x + y * y + lineWidth * lineWidth  
                               + lineLength * lineLength)));  
           g2d.setColor(c);  
   
           // draw lines  
           for (int i = 0; i < numOfLinesToDraw; i++) {  
                // first calculate random positive vector  
                double x1 = rand.nextDouble() - .5;  
                double y1 = rand.nextDouble() - .5;  
   
                // divide by magnitude so we get a unit vector  
                double mag = Math.sqrt(x1 * x1 + y1 * y1);  
                x1 = x1 / mag;  
                y1 = y1 / mag;  
   
                // scale by lineLength  
                x1 = x1 * lineLength;  
                y1 = y1 * lineLength;  
   
                // move to center  
                x1 = x1 + x;  
                y1 = y1 + y;  
   
                // now (x1,y1) represents point on circle with radius lineLength and  
                // centered around (x,y)  
                g2d.drawLine((int) x, (int) y, (int) x1, (int) y1);  
   
                // now recurse  
                generateTreeFractal(g2d, x1, y1, lineWidth * LINE_WIDTH_MULTILIER,  
                          lineLength * LINE_LENGTH_MULTIPLIER);  
   
           }  
   
      }  
   
 }  