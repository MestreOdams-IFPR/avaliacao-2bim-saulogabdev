import java.util.Scanner;

public class BuscaCristaisKyber {

    final static Scanner sc = new Scanner(System.in);
    
    public static int buscaBinaria(int[] vetor, int num) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = 0;
        while (inicio < fim) {
            meio = (fim + inicio)/2;
            if (vetor[meio] == num) {
                return meio;
            } else if (vetor[meio] > num) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
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
        int contCasos = 1;
        int cont = 0;
        
        while (true) {
            numCristais = sc.nextInt();
            numConsultas = sc.nextInt();
            
            if (numCristais == 0 && numConsultas == 0) {
                break;
            }

            System.out.printf("CASE# %d:", contCasos);
            
            int[] cristais = new int[numCristais];

            lerVetorInteiro(cristais);

            while (cont < numConsultas) {
                
            }

        }
    }
}
