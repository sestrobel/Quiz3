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

	@Test(expected = TriangleException.class)
	public void ImaginaryTriangleConstructor() {
		try {
			Triangle tri = new Triangle(2, 8, 2);
		} catch (TriangleException e1) {
			System.out.println("Caught it! Constructor.");
			e1.printStackTrace();
		}
		fail("Didn't catch the exception!?");

	}

	@Test(expected = TriangleException.class)
	public void ImaginaryTriangleArea() {
		Triangle tri = new Triangle();
		try {
			 tri = new Triangle(2, 3, 2);
		} catch (TriangleException e1) {
			System.out.println("Oh?? Wasn't expecting catch.");
			e1.printStackTrace();
		}
		tri.setSide1(80);
		try {
			tri.getArea();
		} catch (TriangleException e) {
			System.out.println("Caught it! Area.");
			e.printStackTrace();
		}
		fail("Didn't catch the exception!?");
	}

	@Test(expected = TriangleException.class)
	public void ImaginaryTrianglePeri() {

		Triangle tri = new Triangle();
		try {
			tri = new Triangle(2, 3, 2);
		} catch (TriangleException e1) {
			System.out.println("Oh?? Wasn't expecting catch.");
			e1.printStackTrace();
		}
		tri.setSide1(80);
		try {
			tri.getPerimeter();
		} catch (TriangleException e) {
			System.out.println("Caught it! Perimeter.");
			e.printStackTrace();
		}
		fail("Didn't catch the exception!?");
	}
}
