import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] precos = new double[5]; 

        System.out.print("Digite o valor do 1º produto: ");
        precos[0] = read.nextDouble();
        double menorPreco = precos[0];

        for (int i = 1; i <5; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "º produto: ");
            precos[i] = read.nextDouble();

            if (precos[i] < menorPreco) {
                menorPreco = precos[i];
            }
        }

        System.out.println("O menor valor dentre os 5 produtos é o de R$" + menorPreco);

        read.close();
    }
}
