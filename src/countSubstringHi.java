public class countSubstringHi {
    public static void main(String[] args) {
        String exampleOne = "abc hi ho";
        String exampleTwo = "ABChi hi";
        String exampleThree = "hihi";

        countSubstringHi tk2 = new countSubstringHi();
        System.out.println("Example 1: " + exampleOne + " --> " + tk2.countHi(exampleOne));
        System.out.println("Example 2: " + exampleTwo + " --> " + tk2.countHi(exampleTwo));
        System.out.println("Example 3: " + exampleThree + "- --> " + tk2.countHi(exampleThree));
    }
    public int countHi(String inputText) {
        int hiCount = 0;
        for (int i=0 ; i < inputText.length()-1 ; i++) {

            String pair = inputText.substring(i , i+2);

            if (pair.equals("hi")) {
                hiCount++;
            }
        }
        return hiCount;
    }
}
