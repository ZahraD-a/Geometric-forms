
public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q2-a
		Rectangle rect1=new Rectangle(20, 20);
		//Q2-b
		Rectangle rect2=new Rectangle(20, 30);
		//Q3-c
		System.out.println(rect1);
		System.out.println(rect2);
		//Q3-d
		System.out.println("Rectangle 1: Surface: "+rect1.getSurface()+" Perimetre: "+rect1.getPerimetre());
		System.out.println("Rectangle 2: Surface: "+rect2.getSurface()+" Perimetre: "+rect2.getPerimetre());
		//Q3-e
		if(rect1.isCarre())
			System.out.println("Rectangle 1 est carré");
		else 
			System.out.println("Rectangle 1 n'est carré");
		
		if(rect2.isCarre())
			System.out.println("Rectangle 2 est carré");
		else 
			System.out.println("Rectangle 2 n'est carré");
	}

}
