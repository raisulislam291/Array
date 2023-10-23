package Practice.Array;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i+ ": ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Index\tValues");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+ "\t"+ numbers[i]);
        }
    }
}
