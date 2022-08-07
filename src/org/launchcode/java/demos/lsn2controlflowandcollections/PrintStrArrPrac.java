package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;

import static java.lang.System.out;

public class PrintStrArrPrac {
public static void printNthWord() {
    Scanner input = new Scanner(System.in);
    String words = "I would not, could not, in a box. I would not, could not with " +
            "a fox. I will not eat them in a house. I will not eat them with a " +
            "mouse.";
    String[] wordsArr = words.split(" ");

    out.println("What is the length of the words you want to see?");
    int numberGiven = input.nextInt();

    for (String word : wordsArr) if (word.length() == numberGiven) {
        out.println(word);
    }
}
}
