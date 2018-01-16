package com.tw.practice;


public class Vowel {

    private final String allVowel = "aeiouAEIOU";

    private final String replaceStringForVowel = "mommy";

    private final float thirtyPercent = 0.3f;

    private final int noVowelUntilNow = -1;


    public boolean isOverThirtyPercent(String inputString) {

        int vowelNumberCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (allVowel.contains(inputString.substring(i, i + 1))) {
                vowelNumberCount++;
            }
        }

        if ((float)vowelNumberCount/inputString.length() > thirtyPercent) {
            return true;
        }
        return false;
    }

    public String replaceVowel(String inputString) {

        if (isOverThirtyPercent(inputString)) {

            StringBuffer repalcedString = new StringBuffer();
            int vowelIndex = noVowelUntilNow;

            for (int i = 0; i < inputString.length(); i++) {

                if (allVowel.contains(inputString.substring(i, i + 1))) {

                    if (vowelIndex == noVowelUntilNow || i - vowelIndex != 1) {
                        repalcedString.append(replaceStringForVowel);
                    }

                    vowelIndex = i;

                } else {
                    repalcedString.append(inputString.substring(i, i + 1));
                }
            }
            return repalcedString.toString();
        }
        return inputString;
    }

}
