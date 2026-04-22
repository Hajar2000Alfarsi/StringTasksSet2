public class beforeWordAfter {
    public static void main(String[] args) {
        String exampleOne = "abcXY123XYijk";
        String exampleTwo = "XY123XY";
        String exampleThree = "XY1XY";

        beforeWordAfter tk21 = new beforeWordAfter();

        System.out.println("Example 1 --> " + tk21.wordEnds(exampleOne, "XY"));
        System.out.println("Example 2 --> " + tk21.wordEnds(exampleTwo, "XY"));
        System.out.println("Example 3 --> " + tk21.wordEnds(exampleThree, "XY"));
    }
    public String wordEnds(String inputText, String word) {
     String resultText = "";
     int wordLength = word.length();

     for (int i = 0; i <= inputText.length() - wordLength; i++) {
         if (inputText.substring(i, i + wordLength).equals(word)) {
             if (i > 0) {
                 resultText = resultText + inputText.charAt(i - 1);
             }

             if (i + wordLength < inputText.length()) {
                 resultText = resultText + inputText.charAt(i + wordLength);
             }
         }
     }
     return resultText;
    }
}
