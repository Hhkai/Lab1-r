package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class tst {

	
	@Test
	public void test1() {
		Graph G = new Graph();
		G.readFile("C:\\myTemp\\111.txt");
		String exp = Lab1.generateNewText(G, "one three");
		assertEquals(exp, "one two three");
	}
	public void test2() {
		Graph G = new Graph();
		G.readFile("C:\\myTemp\\111.txt");
		String exp = Lab1.generateNewText(G, "one");
		assertEquals(exp, "one");
	}
	public void test3() {
		Graph G = new Graph();
		G.readFile("C:\\myTemp\\111.txt");
		String exp = Lab1.generateNewText(G, "one two");
		assertEquals(exp, "one two");
	}
	public void test4() {
		Graph G = new Graph();
		G.readFile("C:\\myTemp\\111.txt");
		String exp = Lab1.generateNewText(G, "one three four");
		assertEquals(exp, "one two three four");
	}
}
