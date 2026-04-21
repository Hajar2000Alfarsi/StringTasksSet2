public class xyBalance {
    public static void main(String[] args) {
        String exampleOne = "aaxbby";
        String exampleTwo = "aaxbb";
        String exampleThree = "yaaxbb";

        xyBalance tk8 = new xyBalance();

        System.out.println("Example 1 --> " + tk8.xyBalanceCheck(exampleOne));
        System.out.println("Example 2 --> " + tk8.xyBalanceCheck(exampleTwo));
        System.out.println("Example 3 --> " + tk8.xyBalanceCheck(exampleThree));
    }

    public boolean xyBalanceCheck(String inputText) {
        boolean checkX = false;
        boolean ckeckY = false;
        for (int i =0; i < inputText.length(); i++){
            if(inputText.charAt(i) == 'x') {
                for (int j =i+1; j < inputText.length(); j++){
                    if(inputText.charAt(j) == 'y') {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
