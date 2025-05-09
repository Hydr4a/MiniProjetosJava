import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição ["+ i +"]["+ j +"]: ");
                matriz[i][j] = read.nextInt();
            }
        }
        
        System.out.println("\nMatriz:");
        for (int i=0; i <4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("\nDiagonal secundária:");
        int somaSecundaria = 0;
        for (int i = 0; i<4; i++) {
            System.out.print(matriz[i][3-i] + " ");
            somaSecundaria += matriz[i][3-i];
        }
        
        int somaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaTotal += matriz[i][j];
            }
        }
        double media = somaTotal / 16.0;
        System.out.println("\n\nSoma dos elementos da diagonal secundária: " + somaSecundaria);
        System.out.println("Média geral: " + media);
        System.out.println("Elementos acima da média:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > media) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        read.close();
    }
}