
public class Circle {
	private double r;
	
	
	public Circle() {
		this.r = 0.0;
		
	}
	
	public Circle( double r) {
		this.r = r;
	}

	public double area() {
		return Math.PI * r * r ;		
	}
	public double circum() {
		return 2 * Math.PI * r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	
}
