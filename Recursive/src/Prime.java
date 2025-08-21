public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(10,2));
    }

    public static boolean isPrime(int n, int i) {
        if (i > Math.sqrt(n)) {
            return true; 
        }
        if (n%i == 0) return false;
        return isPrime(n, i+1);
    }
}
