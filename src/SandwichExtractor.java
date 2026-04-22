public class SandwichExtractor {
    public static void main(String[] args){
        String exampleOne = "breadjambread";
        String exampleTwo = "xxbreadjambreadyy";
        String exampleThree = "xxbreadyy";

        SandwichExtractor tk15 = new SandwichExtractor();

        System.out.println("Example 1 --> " + tk15.getSandwich(exampleOne));
        System.out.println("Example 2 --> " + tk15.getSandwich(exampleTwo));
        System.out.println("Example 3 --> " + tk15.getSandwich(exampleThree));
    }
    public String getSandwich(String inputText) {
        int firstBread = inputText.indexOf("bread");
        int lastBread = inputText.lastIndexOf("bread");

        if (firstBread != lastBread){
            int startprifix = firstBread + 5;
            return inputText.substring(startprifix,lastBread);
        }
        return "";
    }
}
