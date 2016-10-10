
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	Triangle () {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle( double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		return;
	}

	public double getSide1() {
		return side1;}
	public double getSide2() {
		return side2;}
	public double getSide3() {
		return side3;}	
		
	double getPerimeter() {
		return side1 + side2 + side3;}
	
	double getArea() { 
		double perimeter;
		perimeter = side1 + side2 + side3;
		return Math.pow((perimeter *(perimeter - side1)*(perimeter - side2)*(perimeter - side3)), (1/2));}
	
	public static void toString(String[] args) {
		System.out.println("This triangle is made out of three sides!");
	}
	
	
}