package pa03;
import java.awt.Graphics;
import java.awt.Color;
public class ChengCircles extends CircleShape{
  
  private int a;

  public ChengCircles(){
    super();
    this.color=new Color(0,255,0,100);
    this.a=(int)(Math.random()*50);

  }
  public void draw(Graphics g){
    super.draw(g);
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor(Color.BLUE);
    g.drawRect( u,v,w+this.a,h+this.a);
  }
}
