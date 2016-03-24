
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* This class does the addition and multiplications of BigIntegers
* Input : Two lines containing two numbers, a and b.
* Output : Two lines; the first line should contain a+b, and the second line should contain a×b. 
*          Any leading zeros shall not be printed.
*/

public class BigIntegerOperations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BigInteger in1 = reader.nextBigInteger();
        BigInteger in2 = reader.nextBigInteger();
        BigInteger add = in1.add(in2);
        BigInteger multi = in1.multiply(in2);
        System.out.println(add.toString());
        System.out.println(multi.toString());
    }
}
