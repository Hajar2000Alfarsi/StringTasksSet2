public class endChecker {
    public static void main(String[] args) {
        String exampleOneFirst = "Hiabc";
        String exampleOneSecond = "abc";

        String exampleTwoFirst = "AbC";
        String exampleTwoSecond = "HiaBc";

        String exampleThreeFirst = "abc";
        String exampleThreeSecond = "abXabc";

        endChecker tk5 = new endChecker();

        System.out.println("Example 1 --> " + tk5.endOther(exampleOneFirst, exampleOneSecond));
        System.out.println("Example 2 --> " + tk5.endOther(exampleTwoFirst, exampleTwoSecond));
        System.out.println("Example 3 --> " + tk5.endOther(exampleThreeFirst, exampleThreeSecond));
    }

    public boolean endOther(String firstText, String SecondText) {
        String lowerFirstText = firstText.toLowerCase();
        String lowerSecondText = SecondText.toLowerCase();

        return lowerFirstText.endsWith(lowerSecondText) ||
                lowerSecondText.endsWith(lowerFirstText);
    }
}
