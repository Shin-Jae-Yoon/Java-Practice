package chap06;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};
        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);

        if (copyTo == copyFrom) {
            System.out.println("copyTo == copyFrom");
        } else {
            System.out.println("copyTo != copyFrom");
        }

        for (int c : copyTo) {
            System.out.println(c);
        }

        System.out.println("----------------------------------");

        int[] copyTo2 = Arrays.copyOf(copyFrom, 5);

        for (int c : copyTo2) {
            System.out.println(c);
        }

        System.out.println("----------------------------------");

        int[] copyTo3 = copyFrom;
        for (int c : copyTo3) {
            System.out.println(c);
        }

        if (copyTo3 == copyFrom) {
            System.out.println("copyTo3 == copyFrom");
        } else {
            System.out.println("copyTo3 != copyFrom");
        }
    }
}
