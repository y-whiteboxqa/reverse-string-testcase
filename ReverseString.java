package com.wbl.sample;

public class ReverseString {

    public static String reverseStr(String original) {

        if (original == null || original.isEmpty()) {
            return original;
        }
        String reverse = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
        }

        return reverse;

    }
}

