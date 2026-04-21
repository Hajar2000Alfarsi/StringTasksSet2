public class CatDogChecker {
    public static void main(String[] args) {
        String exampleOne = "catdog";
        String exampleTwo = "catcat";
        String exampleThree = "1cat1cadodog";

        CatDogChecker tk3 = new CatDogChecker();

        System.out.println("Example 1: " + exampleOne + " → " + tk3.equalDogCatOcuurence(exampleOne));
        System.out.println("Example 2: " + exampleTwo + " → " + tk3.equalDogCatOcuurence(exampleTwo));
        System.out.println("Example 3: " + exampleThree + " → " + tk3.equalDogCatOcuurence(exampleThree));
    }

    public boolean equalDogCatOcuurence(String inputText) {
        int catCount = 0;
        int dogCount = 0;

        for (int i=0 ; i < inputText.length()-2 ; i++) {
            String part = inputText.substring(i , i+3);
             if (part.equals("cat")) {
                 catCount++;
             } else if (part.equals("dog")) {
                 dogCount++;
             }
        }
        return  catCount == dogCount;
    }
}
