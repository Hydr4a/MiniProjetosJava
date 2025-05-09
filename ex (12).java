import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[7][5];
        int[] livresPorDia = new int[7];
        int ocupados = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Sala (" + (i + 1) + ") - Horário (" + (j + 1) + "): ");
                matriz[i][j] = read.nextInt();
                if (matriz[i][j] == 1) {
                    ocupados++;
                } else {
                    livresPorDia[i]++;
                }
            }
        }
        System.out.println("\nMatriz completa:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0;j<5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTotal de horários ocupados: " + ocupados);

        int maxLivres = livresPorDia[0];
        for (int i = 1; i < 7; i++) {
            if (livresPorDia[i]> maxLivres) {
                maxLivres = livresPorDia[i];
            }
        }
        System.out.println("Dias com mais horários livres:");
        for (int i = 0; i < 7; i++) {
            if (livresPorDia[i] == maxLivres) {
                System.out.println("Dia " + (i + 1));
            }
        }

        read.close();
    }
}
