import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        String firstWord = A.toUpperCase();
        String secondWord = B.toUpperCase();
        
        //lexicographically
        int lexicographically = A.compareTo(B); 
        String results;
        if (lexicographically < 0 || lexicographically == 0) {
            results = "No";
        } else {
            results = "Yes";
        }
        
        //convert to first letter of the string
        char capitalizedFirstWord = firstWord.charAt(0);
        char capitalizedSecondtWord = secondWord.charAt(0);
        int x = A.length();
        int y = B.length();
        
        
        System.out.println(sum);
        System.out.println(results);
        
        System.out.print(capitalizedFirstWord);
        for (int i = 1; i < x; i++ ) {
            System.out.print(A.charAt(i));
        }
        System.out.print(" ");
        System.out.print(capitalizedSecondtWord);
        for (int i = 1; i < y; i++ ) {
            System.out.print(B.charAt(i));
        }
        
        sc.close();
    }
}



