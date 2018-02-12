package pa03;
import java.awt.Color;


public class Rcircle extends CircleShape{

  private Color k = new Color(89,0,34);

  public static void main(String[] args){
    Rcircle x = new Rcircle();
    System.out.println("The circle is "+x);
  }

  public String toString(){
    return "R circle" + super.toString();
  }

  public Rcircle(){
    super();
    this.color = k;
  }

  public void update(double dt){
    this.radius = Math.random()*50;
    super.update(dt);
  }
}
