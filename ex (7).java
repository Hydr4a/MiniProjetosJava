import java.util.Scanner; 
public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int[] quantidades = new int[8];
        int total=0;
        for (int i = 0; i < quantidades.length; i++) {
            System.out.print("Digite a quantidade do "+(i+1)+"º produto: ");
            quantidades[i] = read.nextInt();
            total += quantidades[i];
        }
        for (int i = 0; i < quantidades.length; i++) {
            System.out.println("Quantidade do produto "+(i+1)+": "+quantidades[i]);
        }
        for (int i = 0; i < quantidades.length; i++) {
            if (quantidades[i] < 10) {
                System.out.println("O produto "+(i+1)+" tem menos de 10 unidades!");
            } 
        }
        System.out.println("Total de produtos: "+total);
        read.close();

    }
}
