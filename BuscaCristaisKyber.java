import java.util.Scanner;

public class BuscaCristaisKyber {

    final static Scanner sc = new Scanner(System.in);
    
    public static int buscaBinaria(int[] vetor, int num) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = 0;
        while (inicio <= fim) {
            meio = (fim + inicio)/2;
            if (vetor[meio] == num) {
                return meio;
            } else if (vetor[meio] > num) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static void lerVetorInteiro(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int numCristais;
        int numConsultas;
        int consulta;
        int posicao;
        int contCasos = 1;
        int cont = 0;
        
        while (true) {
            numCristais = sc.nextInt();
            numConsultas = sc.nextInt();
            
            if (numCristais == 0 && numConsultas == 0) {
                break;
            }

            int[] cristais = new int[numCristais];
            
            lerVetorInteiro(cristais);
            
            System.out.printf("CASE# %d:\n", contCasos);

            while (cont < numConsultas) {
                consulta = sc.nextInt();
                posicao = buscaBinaria(cristais, consulta);
                if (posicao != -1) {
                    System.out.printf("%d found at %d\n", consulta, posicao);
                } else {
                    System.out.printf("%d not found\n", consulta);
                }
                cont++;
            }
            contCasos++;
        }
    }
}
