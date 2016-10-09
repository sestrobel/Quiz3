package base;

public class TriangleException extends Exception {
	
	private Triangle triangle;

	public TriangleException(Triangle tri, String message) {
		super(message);
		this.triangle = tri;
	}
	
	public String getTriangle() {
		return triangle.toString();
		}
}
