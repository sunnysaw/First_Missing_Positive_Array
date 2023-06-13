/*
Question : You are given an array 'Arr' of integer of length N. Your task is to find the first missing positive integer
          in linear time and constant space. In other words, find the lowest positive integer that does not exist in the
          array. The array can have negative number as well.
 _______________________________________________________________________________________________________________________
 */
import java.util.Scanner;
public class Main {
    static int First_Missing_Positive(int[] array, int smallestNumber) {
        for (int start = 0; start < array.length; start++) {
            for (int i : array) {
                if (smallestNumber == i && i > 0) {
                    smallestNumber++;
                }
            }
        }
        return smallestNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,sizeOfArray,smallestNumber = 1;
        System.out.println("Enter the size of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result : ");
        System.out.println(First_Missing_Positive(array,smallestNumber));
    }
}