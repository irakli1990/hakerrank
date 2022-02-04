import java.util.*;

// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string , print Yes if it is a palindrome, print No otherwise.

public class Solution0003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String aReverse = "";
        char character;

        for (int i = 0; i < A.length(); i++) {
            character = A.charAt(i);
            aReverse = character + aReverse;
        }

        boolean isEqual = A.equals(aReverse);

        if (isEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}