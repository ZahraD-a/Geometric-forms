
public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(){
		this.a=new Point();
		this.b=new Point();
		this.c=new Point();
	}
	
	public Triangle(Point a, Point b, Point c){
		this.a=new Point(a);
		this.b=new Point(b);
		this.c=new Point(c);
	}
	
	public Triangle(Triangle triangle){
		this.a=new Point(triangle.a);
		this.b=new Point(triangle.b);
		this.c=new Point(triangle.c);
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public double getPerimetre(){
		return a.distance(b)+a.distance(c)+b.distance(c);
	}
	
	public double getSurface(){
		double p=this.getPerimetre()/2.0;
		return Math.sqrt(p*(p-this.getAB())*(p-this.getAC())*(p-this.getBC()));
	}
	
	public boolean isIsocel(){
		if(a.distance(b)==a.distance(c))
			return true;
		else return false;
	}
	
	public double getAB(){
		return a.distance(b);
	}
	
	public double getAC(){
		return a.distance(c);
	}
	
	public double getBC(){
		return b.distance(c);
	}
	
	public String toString(){
		return "Triangle: A("+a.getX()+", "+a.getY()+"), B("+b.getX()+", "+b.getY()+"), C("+c.getX()+", "+c.getY()+")";
	}
}
