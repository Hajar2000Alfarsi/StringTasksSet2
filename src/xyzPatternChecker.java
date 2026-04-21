public class xyzPatternChecker {
    public static void main(String[] args) {
        String exampleOne = "abcxyz";
        String exampleTwo = "abc.xyz";
        String exampleThree = "xyz.abc";

        xyzPatternChecker tk6 = new xyzPatternChecker();

        System.out.println("Example 1 --> " + tk6.xyzThere(exampleOne));
        System.out.println("Example 2 --> " + tk6.xyzThere(exampleTwo));
        System.out.println("Example 3 --> " + tk6.xyzThere(exampleThree));
    }
    public boolean xyzThere(String inputText) {
        for (int i = 0; i < inputText.length() -2; i++) {
            if (inputText.substring(i, i+3).equals("xyz")){
                if (i == 0 || inputText.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
}
