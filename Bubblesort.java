package Assignment_1;
import java.util.Scanner;
public class Bubblesort {
	
	public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of an inputarray: ");
        int size = scanner.nextInt();
        int[] inputarray = new int[size];
        System.out.print("Enter " + size + " Numbers:"+"\n");
        for (int i = 0; i < size; i++) {
            inputarray[i] = scanner.nextInt();
        }     
        scanner.close();
        
        
        System.out.print("Input array: ");
        for (int i = 0; i < inputarray.length; i++) {
            System.out.print(inputarray[i] + " ");
        }
        System.out.println();
        // Sorting in ascending order
        bubbleSortAscending(inputarray);
        System.out.println("Min Value: "+inputarray[0]);
        System.out.println("Max Value: "+inputarray[inputarray.length-1]);
        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i < inputarray.length; i++) {
            System.out.print(inputarray[i] + " ");
        }
        System.out.println();

        // Sorting in descending order
        bubbleSortDescending(inputarray);
        System.out.print("Sorted array in descending order: ");
        for (int i = 0; i < inputarray.length; i++) {
            System.out.print(inputarray[i] + " ");
        }

    }

    // Method to perform Bubble Sort in ascending order
    public static void bubbleSortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the element found is greater than the next element
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform Bubble Sort in descending order
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap if the element found is less than the next element
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
