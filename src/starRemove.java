public class starRemove {
    public static void main(String[] args){
        String exampleOne = "ab*cd";
        String exampleTwo = "ab**cd";
        String exampleThree = "sm*eilly";

        starRemove tk19 = new starRemove();

        System.out.println("Example 1 --> " + tk19.starOut(exampleOne));
        System.out.println("Example 2 --> " + tk19.starOut(exampleTwo));
        System.out.println("Example 3 --> " + tk19.starOut(exampleThree));
    }
    public String starOut(String inputText) {
        String resultText = "";
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == '*') {
                break;
            } else {
                resultText = resultText + inputText.charAt(i);
            }
        }
        return resultText;
    }
}
