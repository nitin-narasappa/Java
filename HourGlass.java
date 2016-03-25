
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* Input: There will be exactly 6 lines, each containing 6 integers seperated by spaces.
* Each integer will be between −9 and 9 inclusive.
* 
* Output: Print the largest sum among all the hourglasses to this problem on a single line.
*/

public class HourGlass {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        int largestSum = 0;
        // Read the input and create a matrix
        for (int index=0; index<6; index++){
            for (int index2=0; index2<6; index2++){
                matrix[index][index2] = reader.nextInt();
            }
        }

        // Intialise with a big negative number.
        int m = -10000;
        for (int i=0;i<=3;++i){
            for (int j=0;j<=3;++j){
                //Get the sum of biggest hour glass possible in the matrix.
                int s = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if (s>m) m=s;
            }
        }
        System.out.println(m);
    }
}
