public class RearrangeGroup {
    public static void main(String[] args){
        String exampleOne = "abc";
        String exampleTwo = "tca";
        String exampleThree = "tcagdo";

        RearrangeGroup tk17 = new RearrangeGroup();

        System.out.println("Example 1 --> " + tk17.oneTwo(exampleOne));
        System.out.println("Example 2 --> " + tk17.oneTwo(exampleTwo));
        System.out.println("Example 3 --> " + tk17.oneTwo(exampleThree));
    }
    public String oneTwo(String inputText) {
        String resultText = "";
        for (int i = 0; i <= inputText.length() - 3; i+=3) {
            resultText = resultText +
                    inputText.charAt(i+1) +
                    inputText.charAt(i+2) +
                    inputText.charAt(i);
        }
        return resultText;
    }
}
