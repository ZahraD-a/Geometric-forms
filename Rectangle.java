
public class Rectangle {
	private double largeur;
	private double longeur;
	
	public Rectangle(){
		this.largeur=0.0;
		this.longeur=0.0;
	}
	
	public Rectangle(double largeur, double longeur){
		this.largeur=largeur;
		this.longeur=longeur;
	}
	
	public Rectangle(Rectangle rectangle){
		this.largeur=rectangle.largeur;
		this.longeur=rectangle.longeur;
	}
	
	public double getPerimetre(){
		return (this.largeur+this.longeur)*2;
	}
	
	public double getSurface(){
		return this.largeur*this.longeur;
	}
	
	public boolean isCarre(){
		if(this.largeur==this.longeur)
			return true;
		else return false;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public String toString() {
		return "Rectangle [largeur:\n" + largeur + ", longeur:" + longeur + "]";
	}
}
