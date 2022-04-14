
public class TriagleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q3-a
		Point a=new Point(20, 50);
		Point b=new Point(20, 50);
		Point c=new Point(60, 40);
		Triangle triangle=new Triangle(a, b, c);
		//Q3-b
		System.out.println(triangle);
		//Q3-c
		System.out.println("Le périmetre: "+triangle.getPerimetre()+" La surface: "+triangle.getSurface());
		//Q3-d
		if(triangle.isIsocel())
			System.out.println("Le triangle: "+triangle+" est isocéle");
		else 
			System.out.println("Le triangle: "+triangle+" n'est isocéle");
	}

}
