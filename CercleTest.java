import java.io.*;

public class CercleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q3-a
		Point c1=new Point(50, 50);
		Point p=new Point(100, 100);
		Cercle cercle1=new Cercle(c1, p);
		//Q3-b
		double rayon=20.0;
		Point c2=new Point(40, 80);
		Cercle cercle2=new Cercle(c2, rayon);
		//Q3-c
		System.out.println("Le perimetre du premier cercle est: "+ cercle1.getPerimetre()+" et son rayon est: "+cercle1.getRayon());
		System.out.println("Le perimetre du deuxieme cercle est: "+ cercle2.getPerimetre()+" et son rayon est: "+cercle2.getRayon());
		//Q3-d
		Point p1=new Point(20, 40);
		if(cercle1.appartient(p1) && cercle2.appartient(p1))
			System.out.print("Le poitn "+p1+" appartient a l'intersection du cercle "+cercle1+" et du cercle "+cercle2);
		else 
			System.out.print("Le poitn "+p1+" n'appartient a l'intersection du cercle "+cercle1+" et du cercle "+cercle2);
	}

}
