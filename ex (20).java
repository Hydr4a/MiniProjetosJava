import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] notas = new int[10];
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota da " + (i + 1) + "º prova: ");
            notas[i] = read.nextInt();

            if (notas[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("A quantidade de notas pares são " + pares);

        read.close();
    }
}
