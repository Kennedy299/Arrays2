import java.util.*;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part a
        int[] arr = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The values stored in the array are:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Part b
        System.out.println("Enter a number to search in the array:");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == num) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // Part c
        int[] reverseArr = new int[15];
        for (int i = 0; i < 15; i++) {
            reverseArr[i] = arr[14-i];
        }
        System.out.println("The values stored in the reversed array are:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reverseArr[i] + " ");
        }
        System.out.println();

        // Part d
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        System.out.println("The product of all elements in the array is: " + product);
    }
}
