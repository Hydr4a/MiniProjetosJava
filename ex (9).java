import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int[][] temperaturas = new int[4][4];
        double soma=0;

        for(int i=0; i<temperaturas.length; i++){
            for(int j=0; j<temperaturas[i].length; j++){
                System.out.print("Escreva a "+(j+1)+"ª temperatura medida na "+(i+1)+"ª região: ");
                temperaturas[i][j]=read.nextInt();
                soma=soma+temperaturas[i][j];
            }
            
        }
        double media=soma/16;
            System.out.println("A média de temperatura geral é de "+media+" graus.");
        for(int i=0; i<temperaturas.length; i++){
          for(int j=0; j<temperaturas[i].length; j++){
            if(temperaturas[i][j]>media){
                System.out.println("A temperatura "+temperaturas[i][j]+"°C da "+(i+1)+"ª região é maior que a média geral!");
            }
            }
              
          }
        System.out.println("Matriz completa: ");
        for(int i=0; i<temperaturas.length; i++){
            for(int j=0; j<temperaturas[i].length; j++){
                System.out.print(temperaturas[i][j]+"\t");
            }
            System.out.println();
        }
        
        read.close();
    }
}