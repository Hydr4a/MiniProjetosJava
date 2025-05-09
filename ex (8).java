import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double[] notas = new double[10]; 
    double soma = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite a nota da " + (i + 1) + "ª prova: ");
      notas[i] = read.nextDouble();
      soma=soma+notas[i]; 
    }
    double maiornota = notas[0];
    double menornota = notas[0];
    for (int i = 1; i < 10; i++) {
      if (notas[i] > maiornota) {
        maiornota = notas[i];
      }
      if(notas[i] < menornota){
        menornota = notas[i];
      }
    }
    double media = soma / 10;

    int acimaDaMedia = 0;
    for (int i = 0; i < 10; i++) {
      if (notas[i] > media) {
        acimaDaMedia++;
      }
    }

    System.out.println("A média da turma é: " + media);
    System.out.println("A quantidade de alunos que tiveram nota acima da média foi: " + acimaDaMedia);
    System.out.println("A maior nota foi: " + maiornota);
    System.out.println("A menor nota foi: " + menornota);


    read.close();
  }
}