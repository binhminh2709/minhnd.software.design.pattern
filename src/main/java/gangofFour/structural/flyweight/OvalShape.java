package gangofFour.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by nguye on 11/14/16.
 */
public class OvalShape implements Shape {

  //intrinsic property
  private boolean fill;

  public OvalShape(boolean f) {
    this.fill = f;
    System.out.println("Creating Oval object with fill=" + f);
    //adding time delay
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void draw(Graphics g, int x, int y, int width, int height, Color color) {
//        circle.setColor(color);
//        circle.drawOval(x, y, width, height);
//        if (fill) {
//            circle.fillOval(x, y, width, height);
//        }
  }
}
