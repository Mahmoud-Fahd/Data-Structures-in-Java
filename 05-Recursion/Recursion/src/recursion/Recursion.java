package recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("--- Recusion Demo ---");
        
        // Factorial 
        System.out.println("Factoria of 5: "+factorial(5));
        
        // Fibonacci
        System.out.println("Fibonacci of 6: "+fibonacci(6));
        
        // Sum
        System.out.println("Sum of 10: "+sum(10));
        
        // Power
        System.out.println("Power of 2 raise to 3: "+power(2, 3));
        
        // Binary Search
        
        System.out.println("--- Binary Search ---");
        
        int[] arr = {10, 15, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100};
        
        int targrt = 70;
        
        int low = 0;
        int high = arr.length - 1;
        
        int result = binarySearch(arr, low, high, targrt);
        
        if(result != -1){
            System.out.println("Target "+ targrt +" found at index: "+result);
        }
        else{
            System.out.println("Target "+ targrt +" not found in the array");
        }
    }
    
    // Example 1: Factorial
    // Formula: n! = n * (n - 1)!
    public static int factorial(int n){
        if(n <= 1) return 1; // Base case
        return n * factorial(n - 1); // Recursive step
    }
    
    // Example 2: Fibonacci Sequence
    // Formula: f(n) = f(n - 1) + f(n - 2)
    public static int fibonacci(int n){
        if(n <= 1) return 1; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }
    
    // Example 3: Sum of natural numbers
    // Formula: s(n) = n + s(n - 1)
    public static int sum(int n){
        if(n == 1) return 1; // Base case
        return n + sum(n - 1); // Recusive step
    }
    
    // Example 4: Power Function
    // Formula: x^n = x * x^(n - 1)
    public static int power(int x, int n){
        if(n == 0) return 1; // Base case
        return x * power(x, n-1); // Recursive step
    }
    
    // Example 5: Binary Search
    public static int binarySearch(int []arr, int low, int high, int target){
        // Base case 1: target not found
        if(low > high){
            return -1;
        }
        
        int mid = low + (high - low) / 2;
        
        // Base case 2: target found
        if(arr[mid] == target){
            return mid;
        }
        
        // Recursive step 1: Search the left half
        if(target < arr[mid]){
            return binarySearch(arr, low, mid - 1, target);
        }
        
        // Recursive step 2: Search the right half
        return binarySearch(arr, mid + 1, high, target);
    }
}
