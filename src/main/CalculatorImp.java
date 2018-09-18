package main;

public class CalculatorImp implements Calculator {

	@Override
	public int multiply(int a, int b) {
     
		 if (a == 0 || b == 0) {
		        return 0;
		    } 
		 else if (b > 0) {
		        return a + multiply(a, b - 1);
		    }
		    return -multiply(a, -b);
		}

	

	

	@Override
	public int devide(int num1, int num2) {
		
		if (num1 == 0) 
		       return 0; 
		   if (num2 == 0) 
		     return 0; 
		  
		   boolean negResult = false; 
		  
		   // Handling negative numbers 
		   if (num1 < 0) 
		   { 
		       num1 = -num1 ; 
		       if (num2 < 0) 
		           num2 = - num2 ;  
		       else
		           negResult = true; 
		   } 
		   else if (num2 < 0) 
		   { 
		       num2 = - num2 ; 
		       negResult = true;  
		   } 
		  
		   // if num1 is greater than equal to num2 
		   // subtract num2 from num1 and increase 
		   // quotient by one. 
		   int quotient = 0; 
		   while (num1 >= num2) 
		   { 
		       num1 = num1 - num2 ; 
		       quotient++ ; 
		   } 
		  
		   // checking if neg equals to 1 then making 
		   // quotient negative  
		   if (negResult) 
		        quotient = - quotient ; 
		   return quotient ; 
	}

	@Override
	public int add(int a, int b) {

		if (a >= 0 && b >= 0) {

			for (int i = 0; i < b; i++) {

				a++;

			}
			return a;
		}

		if (a < 0 && b < 0) {

			for (int x = 0; x > b; x--) {

				a--;

			}
			return a;
		}
		if (a < 0 && b == 0) {

			for (int x = 0; x < b; x++) {

				a--;

			}
			return a;
		}

		if (a == 0 && b < 0) {

			return b;
		}
		if (a < 0 && b == 0) {

			return a;
		}

		if (a < 0 && b >= 0) {

			for (int i = 0; i < b; i++) {

				a++;

			}
			return a;
		}
		if (a > 0 && b <0) {

			for (int i = 0; i > b; i--) {

				a--;

			}
			return a;
		}
		return 0;

	}

	@Override
	public int substract(int a, int b) {
		if (a >= 0 && b >= 0) {

			for (int i = 0; i < b; i++) {

				a--;

			}
			return a;
		}

		if (a < 0 && b < 0) {

			for (int x = 0; x > b; x--) {

				a++;

			}
			return a;
		}
		if (a < 0 && b == 0) {

			for (int x = 0; x < b; x++) {

				a++;

			}
			return a;
		}

		if (a == 0 && b < 0) {

			return b;
		}

		return 0;

	}
}
