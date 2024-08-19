package Assignment_1;

import java.util.Scanner;

public class AvgPetrol {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of Cities: ");
        int size = scanner.nextInt();
        int[] prices = new int[size];
        System.out.print("Enter the petrol prices of " + size + " cities:"+"\t");
        for (int i = 0; i < size; i++) {
            prices[i] = scanner.nextInt();
        }     
        scanner.close();
        int sum=0;
        for (int i = 0; i < size; i++)
        {
        	sum = sum+prices[i];
        }
        System.out.println("Sum is = "+sum);
        System.out.println("Average is = "+sum/size);
        
        }
       
}
