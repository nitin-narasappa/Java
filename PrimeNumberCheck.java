
public class PrimeNumberCheck {
 
    public boolean isPrimeNumber(int number) {
        // Check if the given number is divisible by any numbers from 2 to half of given number
        // If yes, then it is not a prime number; otherwise it is a prime number.
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
        PrimeNumberCheck mpc = new PrimeNumberCheck();
        System.out.println("Is 17 prime number? "+mpc.isPrimeNumber(17));
        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
    }
}
