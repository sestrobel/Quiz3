package test;

import static org.junit.Assert.*;
import org.junit.Test;

import base.Triangle;
import base.TriangleException;

public class Triangle_Test {
	@Test
	public void RealTriangleArea() {
		Triangle tri = new Triangle();
		try {
			tri = new Triangle(3, 4, 5);
		} catch (TriangleException e1) {
			e1.printStackTrace();
			System.out.println("Oh?? Wasn't expecting catch.");
		}
		try {
			tri.getArea();
			assertTrue(tri.getArea() == 6);
		} catch (TriangleException e) {
			System.out.println("Oh?? Wasn't expecting catch.");
			e.printStackTrace();
		}
	}

	@Test
	public void RealTrianglePeri() {
		Triangle tri = new Triangle();

		try {
			tri = new Triangle(3, 4, 5);
		} catch (TriangleException e1) {
			System.out.println("Oh?? Wasn't expecting catch.");
			e1.printStackTrace();
		}
		try {
			tri.getPerimeter();
			assertTrue(tri.getPerimeter() == 12);
		} catch (TriangleException e) {
			System.out.println("Oh?? Wasn't expecting catch.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void RealTriangleToString() {
		Triangle tri = new Triangle();
		try {
			tri = new Triangle(3, 4, 5);
		} catch (TriangleException e1) {
			System.out.println("Oh?? Wasn't expecting catch.");
			e1.printStackTrace();
		}
		String s = tri.toString();
		String exp = "The length of the sides are 3.0, 4.0, and 5.0. The color is white. It is not filled. The area is 6.0, the perimeter is 12.0";
		assertTrue(s.equals(exp));
	}

	@Test(expected = TriangleException.class)
	public void ImaginaryTriangleConstructor() throws Exception {
		Triangle tri = new Triangle(2, 8, 2);
	}
}
