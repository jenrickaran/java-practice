import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String x = a;
        String y = b;
        boolean res = false;
        char[] n = new char[a.length()];
        char[] j = new char[b.length()];
        int counterFirst = 0;
        int counterSecond = 0;
        
        if (x.length() != y.length()) {
            res = false;
        }

        for (int i = 0; i < x.length(); i++) {
            //System.out.println(a.charAt(i));
            n[i] = x.charAt(i);
            j[i] = y.charAt(i);
            //System.out.println(b.charAt(i));
        }

        for (int i = 0; i < x.length(); i++) {
            char c = n[i];
            char d = j[i];
            for (int z = 0; z < a.length(); z++) {
                if (c == n[z]){
                    counterFirst += 1;
                }
                if (d == j[z]){
                    counterSecond += 1;
                }
            }
        }

        if(counterFirst == counterSecond){
            res = true;
        } else {
            res = false;
        }
        
        
        return res;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
