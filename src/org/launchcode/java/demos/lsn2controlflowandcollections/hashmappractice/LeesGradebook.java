package org.launchcode.java.demos.lsn2controlflowandcollections.hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeesGradebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        String name;
        do {
            System.out.println("What is the student's name?");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.print("What is the student's ID number? ");
                Integer idNum = input.nextInt();
                students.put(idNum, name);

                input.nextLine();
            }
        } while (!name.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
