package test;

import static org.junit.jupiter.api.Assertions.*;
import main.Calculator;
import main.CalculatorImp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorImpTsest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("connextion");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("a la base de donnees");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("chargement");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("liberer les variables");
	}

	@Test
	void testMultiply() {
		int a=3;
		int b=5;
		Calculator c=new CalculatorImp();
		int vo=c.multiply(a,b);
		int va=a*b;
		String message="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.multiply(a, b)==va,"a et b positif"+message);
		a=0;
		b=3;
		vo=c.multiply(a,b);
		va=a*b;
		String message1="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.multiply(a, b)==va,"0 et positif"+message1);
		//a=3;
		//b=0;
		//vo=c.multiply(a,b);
		//va=a*b;
		//String message2="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
	//	assertTrue(c.multiply(a, b)==va,"positif et 0"+message2);
		
		a=-5;
		b=-3;
		vo=c.multiply(a,b);
		va=a*b;
		String message5="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.multiply(a, b)==va,"2 negatif"+message5);
		a=0;
		b=0;
		vo=c.multiply(a,b);
		va=a*b;
		String message6="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.multiply(a, b)==va,"zero et zero"+message6);
		a=-3;
		b=5;
		vo=c.multiply(a,b);
		va=a*b;
		String message7="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.multiply(a, b)==va,"negatif et positif"+message7);
		a=3;
		b=-5;
		vo=c.multiply(a,b);
		va=a*b;
		String message8="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.multiply(a, b)==va,"positif et negatif"+message8);
	}

	@Test
	void testDevide() {
		int a=3;
		int b=5;
		Calculator c=new CalculatorImp();
		int vo=c.multiply(a,b);
		int va=a/b;
		String message="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.devide(a, b)==va,"a et b positif"+message);
		a=0;
		b=3;
		vo=c.multiply(a,b);
		va=a/b;
		String message1="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.devide(a, b)==va,"0 et positif"+message1);
		
		
		a=0;
		b=-3;
		vo=c.devide(a,b);
		va=a/b;
		String message4="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.devide(a, b)==va,"zero et negatif"+message4);
		a=-5;
		b=-3;
		vo=c.devide(a,b);
		va=a/b;
		String message5="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.devide(a, b)==va,"2 negatif"+message5);
		
		a=-3;
		b=5;
		vo=c.devide(a,b);
		va=a/b;
		String message7="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.devide(a, b)==va,"negatif et positif"+message7);
		a=3;
		b=-5;
		vo=c.devide(a,b);
		va=a/b;
		String message8="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.devide(a, b)==va,"positif et negatif"+message8);
	}

	@Test
	
	void testAdd() {
		
		int a=3;
		int b=5;
		Calculator c=new CalculatorImp();
		int vo=c.add(a,b);
		int va=a+b;
		String message="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"a et b positif"+message);
		a=0;
		b=3;
		vo=c.add(a,b);
		va=a+b;
		String message1="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"0 et positif"+message1);
		a=3;
		b=0;
		vo=c.add(a,b);
		va=a+b;
		String message2="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"positif et 0"+message2);
		a=-3;
		b=0;
		vo=c.add(a,b);
		va=a+b;
		String message3="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"negatif et zero"+message3);
		a=0;
		b=-3;
		vo=c.add(a,b);
		va=a+b;
		String message4="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"zero et negatif"+message4);
		a=-5;
		b=-3;
		vo=c.add(a,b);
		va=a+b;
		String message5="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"2 negatif"+message5);
		a=0;
		b=0;
		vo=c.add(a,b);
		va=a+b;
		String message6="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"zero et zero"+message6);
		a=-3;
		b=5;
		vo=c.add(a,b);
		va=a+b;
		String message7="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"negatif et positif"+message7);
		a=3;
		b=-5;
		vo=c.add(a,b);
		va=a+b;
		String message8="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.add(a, b)==va,"positif et negatif"+message8);
	}

	@Test
	void testSubstract() {
		int a=3;
		int b=5;
		Calculator c=new CalculatorImp();
		int vo=c.substract(a,b);
		int va=a-b;
		String message="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.substract(a, b)==va,"a et b positif"+message);
		a=0;
		b=3;
		vo=c.substract(a,b);
		va=a-b;
		String message1="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.substract(a, b)==va,"0 et positif"+message1);
		a=3;
		b=0;
		vo=c.substract(a,b);
		va=a-b;
		String message2="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.substract(a, b)==va,"positif et 0"+message2);
		a=-3;
		b=0;
		vo=c.substract(a,b);
		va=a-b;
		String message3="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.substract(a, b)==va,"negatif et zero"+message3);
		a=0;
		b=-3;
		vo=c.substract(a,b);
		va=a-b;
		String message4="\n a="+a+"\nb="+b+"\nres aotenu"+vo+"\nres att"+va;
		assertTrue(c.substract(a, b)==va,"zero et negatif"+message4);
		
	}

}
