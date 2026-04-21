public class MergeTwoStrings {
    public static void main(String[] args) {
        String exampleOneFirst = "abc";
        String exampleOneSecond = "xyz";

        String exampleTwoFirst = "Hi";
        String exampleTwoSecond = "There";

        String exampleThreeFirst = "xxxx";
        String exampleThreeSecond = "There";

        MergeTwoStrings tk9 = new MergeTwoStrings();

        System.out.println("Example 1 --> " + tk9.mixStrong(exampleOneFirst, exampleOneSecond));
        System.out.println("Example 2 --> " + tk9.mixStrong(exampleTwoFirst, exampleTwoSecond));
        System.out.println("Example 3 --> " + tk9.mixStrong(exampleThreeFirst, exampleThreeSecond));
    }
    public String mixStrong(String firstText, String secondText) {
        String megreRsult = "";
        int maxLength = Math.max(firstText.length(),secondText.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < firstText.length()){
                megreRsult = megreRsult + String.valueOf(firstText.charAt(i));
            }
            if (i < secondText.length()) {
                megreRsult = megreRsult + String.valueOf(secondText.charAt(i));
            }
        }
        return megreRsult;
    }
}
