package pa03;

import java.awt.Color;

public class FrankCircle extends CircleShape{

  private int newRadius = 100;


  public FrankCircle(){
    super();
    this.color = new Color(0,200,50);
  }


  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.color = new Color(this.newRadius,0,0);

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.color = new Color(0,newRadius,0);
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.color = new Color(0,0,newRadius);

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.color = new Color(newRadius,newRadius,0);
    }
    super.keepOnBoard();
  }

}
