package q5;

public class ReverseString {
    public static void main(String[] args) {
        String teste = "Invertendo Strings em Java";

        System.out.println(reverseString1(teste));
        System.out.println(reverseString2(teste));
    }
    // utilizando o método swap --> O(n/2)
    public static String reverseString1(String s){
        var last = s.length() - 1;
        var charArray = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            charArray[i] = s.charAt(last-i);
            charArray[last -  i] = s.charAt(i);
        }
        return String.valueOf(charArray);
    }

    // utilizando método swap com uma variável auxiliar
    public static String reverseString2(String s){
        var charArray = s.toCharArray();
        char temp;
        int right = charArray.length - 1;

        for (int i = 0; i < charArray.length / 2; i++) {
            temp = charArray[right];
            charArray[right] = charArray[i];
            charArray[i] = temp;
            right--;
        }
        return String.valueOf(charArray);
    }

}
