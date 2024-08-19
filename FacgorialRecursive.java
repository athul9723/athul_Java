package Assignment_1;

public class FacgorialRecursive {

	public static void main(String[] args) {
		int number = 0; 
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int n) {
        if (n < 0) {
        	
        	//System.out.println("Number must be non-negative");
           // throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) {
            return 1; 
        }
        return n * factorial(n - 1); 

	}

}
