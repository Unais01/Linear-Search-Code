import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SpinnerDateModel;

/**
 * LinearSearch_code
 */
public class LinearSearch_code {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the index of element to find in an array!");
        int target =Sc.nextInt();
        int[] arr = { 25, 51, 89, 1, 32, 56 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        // System.out.println(LinearSearch(arr, target));
        System.out.println(LinearSearch2(arr, target));
    }
        // Search for index or Element
    static int LinearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return target;
            }
        }
        return -1;
    }
    


        //to find if number is on array or not
    static boolean  LinearSearch2(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return true;
            }
        }
        return false;
    }
}