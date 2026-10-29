import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        
        int counter = str.length() - 1; 
        String results = "";
        
        for(int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)); // left
            char left = str.charAt(i);
            //System.out.println(str.charAt(counter)); // right
            char right = str.charAt(counter);
            counter -= 1;
            if (left != right) {
                results = "No";
                break;
            } else {
                results = "Yes";
            }
        }

        System.out.print(results);
        
    }
}



