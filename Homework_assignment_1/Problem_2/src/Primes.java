public class Primes {
    public static void main(String[] args) {
        int nValues = 10;

       outerLoop: // This is the label
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                continue outerLoop; // Skips to the next iteration of the outer loop
                }
            }
        System.out.println(i); // Prints the prime number
        }
    }   
}