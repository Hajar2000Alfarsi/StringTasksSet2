public class prefixRepeat {
    public static void main(String[] args) {
        String exampleOne = "abXYabc";
        String exampleTwo = "abXYabc";
        String exampleThree = "abXYabc";

        prefixRepeat tk13 = new prefixRepeat();

        System.out.println("Example 1 --> " + tk13.prefixAgain(exampleOne, 1));
        System.out.println("Example 2 --> " + tk13.prefixAgain(exampleTwo, 2));
        System.out.println("Example 3 --> " + tk13.prefixAgain(exampleThree, 3));
    }
    public boolean prefixAgain(String inputText, int prifix){
        String prifixPart = inputText.substring(0,prifix);

        for (int i = prifix; i <= inputText.length() - prifix; i++) {
            String currentPart = inputText.substring(i, prifix+i);

            if (currentPart.equals(prifixPart)) {
                return true;
            }
        }
        return false;
    }
}
