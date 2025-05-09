import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produto[]=new int[3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição ["+ i +"]["+ j +"]: ");
                matriz[i][j] = read.nextInt();
            }
        }
        
        System.out.println("\nMatriz:");
        for (int i=0; i <3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i=0; i <3;i++) {
            produto[i]=1; 
            for (int j = 0; j < 3; j++) {
                produto[i]=produto[i]*matriz[i][j];
                
        }
        System.out.println("O produto da linha "+(i+1)+" é: "+produto[i]);

 
    }
    int maiorProduto = produto[0];
        int linhaMaior = 1;
        for (int i = 1; i < 3; i++) {
            if (produto[i] > maiorProduto) {
                maiorProduto = produto[i];
                linhaMaior = i + 1;
            }
        }
        System.out.println("A linha com maior produto é a linha " +linhaMaior+" com valor de "+maiorProduto);
        read.close();
    }
}
    