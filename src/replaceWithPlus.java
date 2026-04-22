public class replaceWithPlus {
    public static void main(String[] args) {
        String exampleOneText = "12xy34";
        String exampleOneWord = "xy";

        String exampleTwoText = "12xy34";
        String exampleTwoWord = "1";

        String exampleThreeText = "12xy34xyabcxy";
        String exampleThreeWord = "xy";

        replaceWithPlus tk20 = new replaceWithPlus();

        System.out.println("Example 1 --> " + tk20.plusOut(exampleOneText, exampleOneWord));
        System.out.println("Example 2 --> " + tk20.plusOut(exampleTwoText, exampleTwoWord));
        System.out.println("Example 3 --> " + tk20.plusOut(exampleThreeText, exampleThreeWord));
    }
    public String plusOut(String inputText, String keepWord) {
        String resultText = "";
        int keyWordLength = keepWord.length();
        for (int i = 0; i <= inputText.length(); i++) {

            if (i <= inputText.length() - keepWord.length() &&
                inputText.substring(i, i + keepWord.length()).equals(keepWord)) {

                resultText += keepWord;
                i += keepWord.length();

            } else {
                resultText =resultText + "+";
            }
        }
        return resultText;
    }
}
