public class repeaWithSeparator {
    public static void main(String[] args) {
        String exampleOneWord = "Word";
        String exampleOneSeparator = "X";

        String exampleTwoWord = "This";
        String exampleTwoSeparator = "And";

        String exampleThreeWord = "This";
        String exampleThreeSeparator = "And";

        repeaWithSeparator tk12 = new repeaWithSeparator();

        System.out.println("Example 1 --> " + tk12.repeatSeparator(exampleOneWord, exampleOneSeparator, 3));
        System.out.println("Example 2 --> " + tk12.repeatSeparator(exampleTwoWord, exampleTwoSeparator, 2));
        System.out.println("Example 3 --> " + tk12.repeatSeparator(exampleThreeWord, exampleThreeSeparator, 1));
    }

    public String repeatSeparator(String inputText, String separator, int count) {
        String resultText = "";
        for (int i =0; i < count; i++) {
            resultText =resultText + inputText;
            if (i < count - 1) {
                resultText = resultText + separator;
            }
        }
        return resultText;
    }
}
