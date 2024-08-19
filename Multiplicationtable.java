package Assignment_1;

import java.util.Scanner;

public class Multiplicationtable {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value"+" "+"="+" ");
		int value=scanner.nextInt();
		int i;
			for( i=1;i<=value;i++)
			{
				System.out.println("\n"+"\t"+"Table for "+""+i+"\n");
				for(int j=1;j<=10;j++)
				{
					System.out.println( +i+"x"+j+"="+i*j);
				}
				
			}

		}

}
