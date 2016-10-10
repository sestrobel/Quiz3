package base;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	 /** Construct a default triangle, extension of geometric object */
	public Triangle() {}
	
	 /** Construct a triangle, extension of geometric object, with 3 args: doubles that will be the 
	  * values of the sides of the triangle created. */

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Returns value of side1 attribute */
	public double getSide1() {
		return side1;
	}

	/** Sets value of side1 attribute*/
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/** Returns value of side2 attribute */
	public double getSide2() {
		return side2;
	}

	/** Sets value of side1 attribute*/
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/** Returns value of side3 attribute */
	public double getSide3() {
		return side3;
	}

	/** Sets value of side1 attribute*/
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/** Returns value of the triangle's perimeter if the triangle is real.
	 * @throws TriangleException*/
	public double getPerimeter() throws TriangleException{
		double p = ((side1 + side2 + side3)/2);	
		double num = (p*(p-side1)*(p-side2)*(p-side3));
		if (num <= 0)
			throw new TriangleException(this, "That triangle isn't real!");
		else
			return side1 + side2 + side3;
	}
	
	/** Returns value of the triangle's area if the triangle is real. 
	 * @throws TriangleException*/
	@Override
	public double getArea() throws TriangleException {
		double p = (this.getPerimeter()/2);	
		double num = (p*(p-side1)*(p-side2)*(p-side3));
		if (num <= 0)
			throw new TriangleException(this, "That triangle isn't real!");
		else
			return Math.sqrt(num);
	}
	
	/** Returns information about the triangle: the lengths of the sides, the color, and whether or not it is filled. */
	public String toString(){
		if (this.isFilled())
			try {
				return("The length of the sides are " +  side1 +", "+ side2+", and "+ side3 + ". The color is " + getColor() + ". It is filled. The area is " + getArea() + ", the perimeter is " + getPerimeter());
			} catch (TriangleException e) {
				e.printStackTrace();
				return("Your triangle isn't real!");
			}
		else 
			try {
				return("The length of the sides are " +  side1 +", "+ side2+", and "+ side3 + ". The color is " + getColor() + ". It is not filled. The area is " + getArea() + ", the perimeter is " + getPerimeter());
			} catch (TriangleException e) {
				e.printStackTrace();
				return("Your triangle isn't real!");
			}
	}


}
