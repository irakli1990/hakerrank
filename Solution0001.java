import java.util.*;


public class Solution0001 {



     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();


        System.out.println(A.length()+B.length());

        int compare = A.compareTo(B);
        if(compare < 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }

}