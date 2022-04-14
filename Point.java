
public class Point {
	private int x;
	private int y;
	
	public Point(){
		this.x=0;
		this.y=0;
	}
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public Point(Point p){
		this.x=p.x;
		this.y=p.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(Point p){
		return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
	}
}
