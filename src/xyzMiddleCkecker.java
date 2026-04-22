public class xyzMiddleCkecker {
    public static void main(String[] args) {
        String exampleOne = "AAxyzBB";
        String exampleTwo = "AxyzBB";
        String exampleThree = "AxyzBBB";

        xyzMiddleCkecker tk14 = new xyzMiddleCkecker();

        System.out.println("Example 1 --> " + tk14.xyzMiddle(exampleOne));
        System.out.println("Example 2 --> " + tk14.xyzMiddle(exampleTwo));
        System.out.println("Example 3 --> " + tk14.xyzMiddle(exampleThree));
    }
    public boolean xyzMiddle(String inputText){
        for (int i = 0; i < inputText.length() - 4; i++) {
            if(inputText.substring(i, i+3).equals("xyz")){
                int leftSideLength = i;
                int rightSideLength = inputText.length() - (i + 3);

                if (Math.abs(leftSideLength-rightSideLength) <= 1){
                    return true;
                }
            }
        }
        return false;
    }
}
