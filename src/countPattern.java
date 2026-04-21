public class countPattern {
    public static void main(String[] args) {
        String exampleOne = "aaacodebbb";
        String exampleTwo = "codexxcode";
        String exampleThree = "cozexxcope";

        countPattern tk4 = new countPattern();
        System.out.println("Example 1: " + exampleOne + " --> " + tk4.countCodePatterns(exampleOne));
        System.out.println("Example 2: " + exampleTwo + " --> " + tk4.countCodePatterns(exampleTwo));
        System.out.println("Example 3: " + exampleThree + " --> " + tk4.countCodePatterns(exampleThree));
    }
    public int countCodePatterns(String inputText) {
        int patternCount = 0;
        for (int i = 0 ; i < inputText.length() - 3 ; i++) {
            if (inputText.charAt(i) == 'c' &&
                inputText.charAt(i+1) == 'o' &&
                inputText.charAt(i+3) == 'e') {
                patternCount++;
            }
        }
        return patternCount;
    }
}
