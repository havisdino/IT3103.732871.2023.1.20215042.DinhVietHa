// Dinh Viet Ha 20215042
// Ex 6.5

package hust.soict.ite6.lab01.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        Arrays.sort(arr);

        int sum = 0;
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum: " + sum);

        double mean = (double) sum / arr.length;
        System.out.println("Mean: " + mean);
    }
}