package test;
import static org.junit.Assert.*;
import org.junit.Test;

import base.Triangle;
import base.TriangleException;

public class Triangle_Test {
	@Test
	public void RealTriangleArea(){
		Triangle tri = 	new Triangle(3, 4, 5);
		try {
			tri.getArea();
			assertTrue(tri.getArea() == 6);
		} catch (TriangleException e) {
			System.out.println("Stop that!");
			e.printStackTrace();
		}
	}
		
		@Test
	public void RealTrianglePeri(){
		Triangle tri = 	new Triangle(3, 4, 5);
		try {
			tri.getPerimeter();
			assertTrue(tri.getPerimeter() == 12);
		} catch (TriangleException e) {
			System.out.println("Gross!");
			e.printStackTrace();
		}
	}
	
	@Test(expected = TriangleException.class) 
	public void ImaginaryTriangleArea(){

		Triangle tri = 	new Triangle(2, 8, 2);
		try {
			tri.getArea();
		} catch (TriangleException e) {
			System.out.println("Stop that!");
			e.printStackTrace();
		}
		fail("Didn't catch the exception!?");
	}

	@Test(expected = TriangleException.class) 
	public void ImaginaryTrianglePeri(){

		Triangle tri = 	new Triangle(2, 8, 2);

		try {
			tri.getPerimeter();
		} catch (TriangleException e) {
			System.out.println("Gross!");
			e.printStackTrace();
		}
		fail("Didn't catch the exception!?");
	}	
}


