import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int[] turnoManha = new int[5];
    int[] turnoNoite = new int[5];
    int[] diferenca = new int[5];

    System.out.println("Digite os valores do turno da manhã:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Posição " +  (i+ 1) + ": ");
      turnoManha[i] = read.nextInt();
    }

    System.out.println("Digite os valores do turno da noite:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Posição " + (i +1) + ": ");
      turnoNoite[i] = read.nextInt();
    }

    for (int i = 0; i < 5; i++) {
      diferenca[i] = Math.abs(turnoManha[i] - turnoNoite[i]);
    }

    System.out.println("Diferença absoluta entre os valores correspondentes:");
    for (int i = 0; i < 5; i++) {
      System.out.println("Posição " +  (i+1) + ": " + diferenca[i]);
    }

    read.close();
  }
}
