package Assignment_1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 100;
        System.out.println("Prime numbers less than " + limit + ":");
        for (int num = 2; num < limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + ", ");
            }
}
}
	  public static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        if (number == 2) return true; // 2 is a prime number
	        if (number % 2 == 0) return false; // Other even numbers are not primes
	        for (int i = 3; i <= Math.sqrt(number); i += 2) {
	            if (number % i == 0) return false;
	        }
	        return true;
		}
}

