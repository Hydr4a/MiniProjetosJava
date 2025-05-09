import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        double[][] vendas = new double[3][4];
        double total=0;

        for(int i=0; i<vendas.length; i++){
            double soma=0;
            for(int j=0; j<vendas[i].length; j++){
                System.out.print("Escreva o valor das vendas do "+(i+1)+" funcionário na "+(j+1)+" semana: ");
                vendas[i][j]=read.nextDouble();
                soma=soma+vendas[i][j];
            }
            
            System.out.println("O valor total de vendas do "+(i+1)+" funcionário nessa semana foi de R$"+soma);
           total=total+soma;
        }
        System.out.println("Matriz completa: ");
        for(int i=0; i<vendas.length; i++){
            for(int j=0; j<vendas[i].length; j++){
                System.out.print(vendas[i][j]+"\t");
            }
            System.out.println();
        }
            System.out.println("O total geral de vendas de todos os vendedores foi de R$"+total);
        read.close();
    }
}