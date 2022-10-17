public class Factorial {
    // Dr. Leo COMP 271 10/17/2022
    // Christian Vasquez
    // Recursion

    // method to solve and return a factorial of an int with iteration
    public static int factorialBruteForce(int n) {
        int product = 1;
        for(int i=1; i<=n;i++) {
            product = product*i;
        }
        return product;
    } // method factorialBruteForce


    // method to solve and return a factorial of an int with recursion
    public static int factorialRecursion(int n) {
        int result = 1;
        if (n>0) {
            // the code basically writes itself and keeps dividing the problem into smaller and smaller portions until it is the base case (n)
            result = n * factorialRecursion(n-1);
        }
        return result;
    } // method factorialRecursion


    public static void main(String[] args) {
        // tests
        System.out.println("Testing 10!");
        System.out.println(factorialBruteForce(10));
        System.out.println(factorialRecursion(10));
        System.out.println("\n Testing 5!");
        System.out.println(factorialBruteForce(5));
        System.out.println(factorialRecursion(5));
    } // method main
}
