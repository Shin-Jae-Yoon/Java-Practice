package chap06;

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        Arrays.sort(array);

        int i = Arrays.binarySearch(array, 6);
        System.out.println(i);
    }
}
