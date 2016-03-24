
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
* This class validates the IP address using a regex.
* IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
* Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
* Valid IP address example:
* 000.12.12.034
* 121.234.12.12
* 23.45.12.56

* Invalid address example:
* 000.12.234.23.23
* 666.666.23.23
* .213.123.23.32
* 23.45.22.32.
* I.Am.not.an.ip
*/
class IPValidator{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}
/**
* Regular expression 
*/
class myRegex {
    String numberPattern = "(0{1,3}|0{0,2}[0-9]|0{0,1}[0-9]{1,2}|[1][0-9][0-9]|2[0-4][0-9]|2[0-5][0-5])";
    String pattern = numberPattern + "." +numberPattern + "." + numberPattern  + "." + numberPattern;
}

