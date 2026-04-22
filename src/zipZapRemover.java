public class zipZapRemover {
    public static void main(String[] args) {
        String exampleOne = "zipXzap";
        String exampleTwo = "zopzop";
        String exampleThree = "zzzopzop";

        zipZapRemover tk18 = new zipZapRemover();

        System.out.println("Example 1 --> " + tk18.zipZap(exampleOne));
        System.out.println("Example 2 --> " + tk18.zipZap(exampleTwo));
        System.out.println("Example 3 --> " + tk18.zipZap(exampleThree));
    }
    public String zipZap(String inputText) {
        String resultText = "";

        for (int i = 0; i < inputText.length(); i++) {
            if (i <= inputText.length() - 3 &&
                    inputText.charAt(i) == 'z' &&
                    inputText.charAt(i + 2) == 'p') {
                resultText = resultText + "zp";
                i = i + 2;
            } else {
                resultText = resultText + inputText.charAt(i);
            }
        }
        return resultText;
    }
}
