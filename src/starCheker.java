public class starCheker {
    public static void main(String[] args){
        String exampleOne = "xy*yzz";
        String exampleTwo = "xy*zzz";
        String exampleThree = "*xa*az";

        starCheker tk16 = new starCheker();

        System.out.println("Example 1 --> " + tk16.sameStarChar(exampleOne));
        System.out.println("Example 2 --> " + tk16.sameStarChar(exampleTwo));
        System.out.println("Example 3 --> " + tk16.sameStarChar(exampleThree));
    }
    public boolean sameStarChar(String inputText) {
        for (int i = 0; i < inputText.length(); i++){
            if (inputText.charAt(i) == '*'){
                if (i == 0) {
                    continue;
                }
                if (inputText.charAt(i-1) == inputText.charAt(i+1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
