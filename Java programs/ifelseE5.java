//Take a character as input and determine whether it's a vowel or a consonant.

import java.util.Scanner;
public class ifelseE5
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = scan.next().charAt(0);
        if (isVowel(a)) {
            System.out.println(a + " is a vowel.");
        } else {
            System.out.println(a + " is a consonant.");
        }

        scan.close();
    }

    
    public  static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
