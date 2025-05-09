import java.util.Scanner;

public class ex9 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double[] notas = new double[5]; 
    double soma = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite a nota da " + (i + 1) + "ª prova: ");
      notas[i] = read.nextDouble();
      soma=soma+notas[i]; 
    }

    double media = soma / 5;

    int acimaDaMedia = 0;
    for (int i = 0; i < 5; i++) {
      if (notas[i] > media) {
        acimaDaMedia++;
      }
    }

    System.out.println("A média da turma é: " + media);
    System.out.println("A quantidade de alunos que tiveram nota acima da média foi: " + acimaDaMedia);

    read.close();
  }
}
