package data_types;

import java.util.StringTokenizer;

public class CountingWords {
    public static void main(String[] args) {
        String text ="Far out in the unexplored wastelands of something totally out" +
                " of fashion extension of the galaxy's western spiral arm, a" +
                "little yellow sun glows unnoticed. Orbiting them, also about ninety-one million miles away," +
                " is an absolutely insignificant little blue-greenplanet" +
                " whose ape bioforms are so amazingly primitive that they still" +
                " think digital clocks are an incredibly wonderful invention.";


        StringTokenizer st = new StringTokenizer(text);
        int x = st.countTokens();
        System.out.println("The number of words in the text is: " +x);

        // another method

        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("The number of words in the text is: " +wordCount);
    }
}
