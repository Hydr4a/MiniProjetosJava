import java.util.Scanner;

public class notas {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int[] notas = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + " nota: ");
            notas[i] = read.nextInt();
        }

        System.out.println("Notas digitadas: ");
        for (int nota : notas) {
            System.out.println(nota);
        }

        read.close();
    }
}
