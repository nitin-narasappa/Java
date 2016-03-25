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
* Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{"
*/
public class BalancedString {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()) {
            // Check if the given string is balanced. Print true if balanced; false otherwise.
            if(isBalanced(reader.next())){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
    /**
     * Method to check if the string is balanced.
     */
    private static boolean isBalanced(String str){
        // Empty string is balanced.
        if(str.length() == 0) {
            return true;
        }
        else {
            // Make use of stack (LIFO) for checking the logic.
            // Push the opening brackets on to the stack
            // and match the closing brackets with top of the stack.
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
            // This is incomplete string.
            return stack.isEmpty();
        }
    }
}
