package chap06;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};

        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
