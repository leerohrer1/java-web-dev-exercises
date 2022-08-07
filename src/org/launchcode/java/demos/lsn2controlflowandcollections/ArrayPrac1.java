package org.launchcode.java.demos.lsn2controlflowandcollections;
import static org.launchcode.java.demos.lsn2controlflowandcollections.FindEvenSum.sumEven;
import static org.launchcode.java.demos.lsn2controlflowandcollections.PrintStrArrPrac.printNthWord;

public class ArrayPrac1 {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("done!");

        for (int i : intArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
        System.out.println("done!");

        int[] sumItUp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumEven(sumItUp));

        printNthWord();

    }
}
