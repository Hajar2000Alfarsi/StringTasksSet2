public class DoubleCharacter {
    public static void main(String[] args) {
        String exampleOne = "The";
        String exampleTwo = "AAbb";
        String exampleThree = "Hi-There";

        DoubleCharacter tk1= new DoubleCharacter();
        System.out.println("Example one: " + exampleOne + " -> " + tk1.doublechar(exampleOne));
        System.out.println("Original: " + exampleTwo + " → Result: " + tk1.doublechar(exampleTwo));
        System.out.println("Original: " + exampleThree + " → Result: " + tk1.doublechar(exampleThree));
    }
    public String doublechar(String originalText) {
        String updatedText = "";
        for (int i=0 ; i < originalText.length() ; i++){
            char curentChar = originalText.charAt(i);
            updatedText = updatedText + curentChar + curentChar;
        }
        return updatedText;
    }
}
