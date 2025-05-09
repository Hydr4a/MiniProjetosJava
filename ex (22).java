import java.util.Scanner;

public class ex8 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int[] numeros = new int[6];

    for (int i = 0; i < 6; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = read.nextInt();
    }

    System.out.println("Números na ordem inversa:");
    for (int i = 5; i >= 0; i--) {
      System.out.println(numeros[i]);
    }

    read.close();
  }
}
