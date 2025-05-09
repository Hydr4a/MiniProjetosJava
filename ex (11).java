import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < 5; i++) {
            for (int j =0; j < 5; j++) {
                System.out.print("Digite o valor da posição ["+i+"]["+j+"]: ");
                matriz[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i <5; i++) {
            somaPrincipal+=matriz[i][i];
            somaSecundaria+= matriz[i][4 - i];
        }
        
        System.out.println("\nSoma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        System.out.println("\nElementos comuns das duas diagonais:");
        for (int i = 0; i < 5; i++) {
            if (i == 4 - i) {
                System.out.println(matriz[i][i]);
            }
        }
        read.close();
    }
}
