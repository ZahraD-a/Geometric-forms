
public class Cercle {
	private Point centre;
	private double rayon;
	
	public Cercle(){
		this.centre=new Point();
		this.rayon=0.0;
	}
	
	public Cercle(Point centre, double rayon){
		this.centre=new Point(centre);
		this.rayon=rayon;
	}
	
	public Cercle(Point centre, Point p){
		this.centre=new Point(centre);
		this.rayon=this.centre.distance(p);
	}
	
	public Cercle(Cercle cercle){
		this.centre=new Point(cercle.centre);
		this.rayon=cercle.rayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimetre(){
		return this.rayon*2*Math.PI;
	}
	
	public double getSurface(){
		return Math.pow(this.rayon, 2)*Math.PI;
	}
	
	public boolean appartient(Point p){
		if(this.rayon>=this.centre.distance(p))
			return true;
		else return false;
	}

	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + "]";
	}
}
