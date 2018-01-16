package com.tw.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringReader {

    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {

        String inputString = scanner.next();

        if (Pattern.compile("[A-Za-z]*").matcher(inputString.trim()).matches()) {
            return inputString;
        }

        throw new Exception("Invalid Input");

    }
}
