import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] saltos = new int[6]; 

        for (int i = 0; i<6; i++) {
            System.out.print("Digite a distância do " + (i + 1) + "º salto: ");
            saltos[i] = read.nextInt();
        }

        int maiorSalto = saltos[0]; 
        for (int i = 1; i<6; i++) {
            if (saltos[i] > maiorSalto) {
                maiorSalto = saltos[i];
            }
        }

        System.out.println("O maior salto registrado foi: " +maiorSalto);
        read.close();
    }
}
