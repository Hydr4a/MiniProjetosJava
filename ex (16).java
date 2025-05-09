import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] produtos = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "º produto: ");
            produtos[i] = read.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            soma=soma+produtos[i]; 
        }

        System.out.println("O total da compra é: " + soma);

        read.close();
    }
}
