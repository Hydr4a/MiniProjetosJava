import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int[] numeros = new int[8];
    int novoID;
    boolean idJaCadastrado = false;

    for (int i = 0; i < 8; i++) {
      System.out.print("Digite o número do ID: ");
      numeros[i] = read.nextInt();
    }

    System.out.print("Digite um novo número de ID para cadastro: ");
    novoID = read.nextInt();

    for (int i = 0; i < 8; i++) {
      if (novoID == numeros[i]) {
        idJaCadastrado = true;
        break;
      }
    }

    if (idJaCadastrado) {
      System.out.println("ID já cadastrado! Tente novamente.");
    } else {
      System.out.println("ID cadastrado com sucesso!");
    }

    read.close();
  }
}
