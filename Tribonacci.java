public class Tribonacci {
    
    public static int calcularTribonacciRec(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        return calcularTribonacciRec(n - 1) + calcularTribonacciRec(n - 2) + calcularTribonacciRec(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(calcularTribonacciRec(10));
    }
}
