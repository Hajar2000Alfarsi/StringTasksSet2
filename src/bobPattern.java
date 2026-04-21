public class bobPattern {
    public static void main(String[] args) {
        String exampleOne = "abcbob";
        String exampleTwo = "b9b";
        String exampleThree = "bac";

        bobPattern tk7 = new bobPattern();

        System.out.println("Example 1 --> " + tk7.bobThere(exampleOne));
        System.out.println("Example 2 --> " + tk7.bobThere(exampleTwo));
        System.out.println("Example 3 --> " + tk7.bobThere(exampleThree));
    }
    public boolean bobThere(String inputText) {
        for (int i = 0; i < inputText.length() - 2; i++) {
            if (inputText.charAt(i) == 'b' &&
                inputText.charAt(i+2) == 'b') {
                return true;
            }
        }
        return false;
    }
}
