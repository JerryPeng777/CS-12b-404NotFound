package pa03;

/**
* This program will create a class extends to CircleShape.
* When those balls touch one of the frames, their radius will be changed
* When their radius changed enough small, they will change to big
* When their radius changed enough big, they will change to small
*/

public class FrameRadiusCircle extends CircleShape{

  private double vRadius = 1.0;

  /**
  * Creat radius changing balls and set their colors to green
  */

  public FrameRadiusCircle(){
    super();
    this.color = new java.awt.Color(0, 200, 50, 150);
  }

  /**
  * Keep it on the board as usal, but also change the radius. When those balls
  * reach the different edges, they will change the radius in different ways.
  * For example, when the balls reaches left and top edges, they will become
  * bigger; when the balls reaches right and bottom edges, they will become
  * smaller
  */


  public void keepOnBoard(){
    if(this.x < this.radius && this.radius <= 100){
      //When those balls reach the left edge, it will increase the radius
      this.radius += 5;
    }else if(this.x > CircleShape.boardWidth-this.radius && this.radius >= 30){
      //When those balls reach the right edge, it will decrease the radius
      this.radius -=5;
    }
    if (this.y < this.radius && this.radius <= 100){
      // It went above the top edge! It will increase the radius
      this.radius += 10;
    } else if (this.y > CircleShape.boardHeight-this.radius && this.radius >= 30) {
      // It went below the bottom edge! It will decrease the radius
      this.radius -= 10;
    }
    super.keepOnBoard();
  }





}
