package SeparateChaining;

public class PrimeUtils {
    // Method to check if number prime or not
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2 ; i * i <= num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    // Method to get prime
    public static int getPrime(int num){
        for(int i = num + 1 ; ; i++){
            if(isPrime(i)){
                return i;
            }
        }
    }
}
