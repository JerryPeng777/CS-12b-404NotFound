package pa03;


/**
 * RadiusChangingCircles are yellow circles which move at a constant velocity
 * on the board and bounce off the edges, but whose radius grows and shrinks.
*/
public class IsabelCircle extends CircleShape{

  private double vr=1.0;
  private double vt = 3.0;

  public IsabelCircle(){
    super();
	this.color = new java.awt.Color(0,0,0,100); 
  }

	/**
	 * update the circle as usual, but also change the radius. If it gets too big,
	 * then start it shrinking, if it gets too small then start it growing. Changes
	 * colour as it shrinks and grows 
	 */
  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.

		this.radius += dt*vt*vr;

    if  (this.radius <20){
    	this.vr *= -1;
    	this.color = new java.awt.Color(104, 22, 224,100);
    } else if (this.radius > 60) {
    	this.vr *= -1;
    	this.color = new java.awt.Color(57,255,20,100);
		super.update(dt);
	}
  }




}
