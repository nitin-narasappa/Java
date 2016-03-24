import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* This class checks if the given string is balanced.
* Input: There will be multiple lines in the input file, each having a single non-empty string.
*
* Output: For each case, print 'true' if the string is balanced, 'false' otherwise.
*
* Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
* Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
*/
public class BalancedString {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()) {
            if(isBalanced(reader.next())){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
    
    private static boolean isBalanced(String str){
        if(str.length() == 0) {
            return true;
        }
        else {
            Stack stack = new Stack();
            for(char ch: str.toCharArray()) {
                switch(ch) {
                    case '{':
                    case '[':
                    case '(':
                        stack.push(ch);
                    break;
                    case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                    case ']':
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
                    case ')':
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                }
            }
            return stack.isEmpty();
        }
    }
}
