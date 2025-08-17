public class PolynomPrinter {
    public static void main(String[] args) throws Exception {
        polynomPrinter(9, 0);
        System.out.println();
    }

    public static void polynomPrinter(int n, int i) {
        if (n==i) {
            return;
        }
        if (i==0) {
            System.out.print("1");
        } else if (i==1) {
            System.out.print(" + x");
        } 
        else {
            System.out.print(" + x^" + i);
        }
        polynomPrinter(n, i+1);
    }
}