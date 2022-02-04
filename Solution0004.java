import java.util.*;

// Two strings, a and b,are called anagrams if they contain all the same characters in the same frequencies.
// For this challenge,the test is not case-sensitive.For example,the anagrams of CAT are CAT,ACT,tac,TCA,aTC,and CtA.

public class Solution0004 {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if ((a.length() > b.length() || b.length() > a.length())
                && ((a.length() > 50 || b.length() > 50)
                        && (a.length() < 1 || b.length() < 1))) {
            return false;
        }

        char[] aCharArray = a.toCharArray();
        char[] bCharArray = a.toCharArray();

        for (char i : aCharArray) {
            for (char j : bCharArray) {
                long aTotal = a.chars().filter(ch -> ch == i).count();
                long bTotal = b.chars().filter(ch -> ch == j).count();
                System.out.println(aTotal);
                System.out.println(bTotal);
                if (bTotal != aTotal) {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}