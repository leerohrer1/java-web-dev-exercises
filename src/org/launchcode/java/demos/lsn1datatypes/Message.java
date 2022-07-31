package org.launchcode.java.demos.lsn1datatypes;
import java.util.Scanner;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("gr")) {
            return "hallo Welt!";
        } else {
            return "Hello, World!";
        }
    }
}
