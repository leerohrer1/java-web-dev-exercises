package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceStr = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for in the mysterious string? Enter below:");

        String response = input.nextLine().toLowerCase();
        System.out.println("What you entered (" + response + ") was found in the text: " +
                (aliceStr.contains(response)));

        int index = aliceStr.indexOf(response);
        int length = response.length();
        System.out.println("Your search term first appears at index " + index +
                ". Your term is " + length + " characters long.");

        String modifiedSentence = aliceStr.replace(response, "[omitted] ");
        System.out.println(modifiedSentence);
    }
}
