public class repeateEndsNTime {
    public static void main(String[] args) {
        String exampleOne = "Hello";
        String exampleTwo = "Hello";
        String exampleThree = "Hello";

        repeateEndsNTime tk10 = new repeateEndsNTime();

        System.out.println("Example 1 --> " + tk10.repeatEnd(exampleOne, 3));
        System.out.println("Example 2 --> " + tk10.repeatEnd(exampleTwo, 2));
        System.out.println("Example 3 --> " + tk10.repeatEnd(exampleThree, 1));
    }
    public String repeatEnd(String inputText, int repearCount) {
        String resultText = "";
        String endPart = inputText.substring(inputText.length() - repearCount);

        for (int i=0; i < repearCount; i++) {
            resultText = resultText + endPart;
        }
        return resultText.toString();
    }
}
