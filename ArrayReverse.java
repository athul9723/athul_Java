package Assignment_1;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		//input array
		System.out.print("Input Array : ");
		
		for(int i=0;i<5;++i)
		{
			System.out.print(a[i] +"  ");	
		}
		//reverse array
System.out.print("\n"+"\n"+ "Reversed Array : ");
		
		for(int i=4;i>=0;i--)
		{
			System.out.print(a[i] +"  ");	
		}
		
	}



}
