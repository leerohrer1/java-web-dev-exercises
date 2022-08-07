package org.launchcode.java.demos.lsn2controlflowandcollections;

public class FindEvenSum {
    public static int sumEven(int[] arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
