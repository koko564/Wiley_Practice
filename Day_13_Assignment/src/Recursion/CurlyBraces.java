package Recursion;
import java.util.*;
 
class CurlyBraces {
 
    public static void
    generateParenthesis(int n, int open, int close,
                        String s, ArrayList<String> ans)
    {
 
        if (open == n && close == n) {
            ans.add(s);
            return;
        }
 
        
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "{",
                                ans);
        }
 
       
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + "}",
                                ans);
        }
    }
 
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        ArrayList<String> ans = new ArrayList<>();
 
       
        generateParenthesis(n, 0, 0, "", ans);
 
        for (String s : ans) {
            System.out.println(s);
        }
    }
}