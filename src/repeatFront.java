public class repeatFront {
    public static void main(String[] args) {
        String exampleOne = "Chocolate";
        String exampleTwo = "Chocolate";
        String exampleThree = "Ice Cream";

        repeatFront tk11 = new repeatFront();

        System.out.println("Example 1 --> " + tk11.repeatFrontOfString(exampleOne, 4));
        System.out.println("Example 2 --> " + tk11.repeatFrontOfString(exampleTwo, 3));
        System.out.println("Example 3 --> " + tk11.repeatFrontOfString(exampleThree, 2));
    }
    public String repeatFrontOfString(String inputText, int count) {
        String resultString = "";
        for (int i = count; i > 0; i--) {
            resultString = resultString + inputText.substring(0,i);
        }
        return resultString;
    }
}
