package Assignment_1;

public class Fibonocci {
	public static void main(String[] args) {
		
		 int n = 1000;
		 
				 int a = 0, b = 1;
		    System.out.println("Fibonacci Series until:- " + n);
		    System.out.print(a+",");
		    System.out.print(b+",");
		    
		    for (int i = 2; i <= n; i++)
		    	
		    {	
		    	int c = a + b;
		    	if(c<=n)
		    	{
		      System.out.print(c + ", ");
		    	
		      
		      a = b;
		      b = c;
		    	}
		      
		    }
	}
}
