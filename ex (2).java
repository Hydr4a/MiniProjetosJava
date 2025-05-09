import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição ["+ i +"]["+ j +"]: ");
                matriz[i][j] = read.nextInt();
            }
        }
        System.out.println("\nMatriz:");
        for (int i=0; i <3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nDiagonal principal:");
        int soma = 0;
        for (int i = 0; i<3; i++) {
            System.out.print(matriz[i][i] + " ");
            soma += matriz[i][i];
        }
        System.out.println("\n\nSoma dos elementos da diagonal principal: " + soma);
        read.close();
    }
}
