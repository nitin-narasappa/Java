import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
* Input : The first line will consist an integer n, each of the next n lines will contain a real number. 
* n will be at most 200. The numbers can have at most 300 digits.
*
* Output: Print the numbers in descending orders, one number in each line.
*
*/
public class BigDecimalOperations {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        BigDecimal[] bigNumbers = new BigDecimal[count];
        for (int index = 0; index < count; index++){
            bigNumbers[index] = reader.nextBigDecimal();
        }
        Arrays.sort(bigNumbers);
        for (int index = count-1; index >= 0; index--){
            String strBigDec = bigNumbers[index].toPlainString();

            if(bigNumbers[index].doubleValue() > -1 && bigNumbers[index].doubleValue() < 1) {
                if(strBigDec.contains(".")) {
                   strBigDec = strBigDec.substring(strBigDec.indexOf("."), strBigDec.length());
                }
            }
            System.out.println(strBigDec);
        }
    }
}
