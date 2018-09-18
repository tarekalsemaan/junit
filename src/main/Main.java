package main;

public class Main {

	public static void main(String[] args) {
		 
		Calculator c=new CalculatorImp();

          int x=c.add(-1,-1);
          System.out.println(x);
          
          int y=c.substract(5, 3);
          System.out.println(y);
          
          int z=c.multiply(5, 3);
          System.out.println(z);
	}

}
