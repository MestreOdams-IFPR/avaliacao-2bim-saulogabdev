public class Pell {
    public static int calcularPell(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return 2 * calcularPell(n - 1) + calcularPell(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            System.out.println(i+"=" + (char)i);
        }
    }


}
