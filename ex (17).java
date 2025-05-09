import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota da " + (i + 1) + "º prova: ");
            notas[i] = read.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            soma=soma+notas[i]; 
        }
        double media=soma/4;

        System.out.println("A média das notas digitadas é de " + media);

        read.close();
    }
}
