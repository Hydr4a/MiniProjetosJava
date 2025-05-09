import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[][] matriz = new double[5][3];
        double medias[] = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Notas do "+(i+1)+"º aluno:");
            double soma=0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota da "+(j+1)+"ª prova: ");
                matriz[i][j] = read.nextDouble();
                soma=soma+matriz[i][j];
            }
            medias[i] = soma/3;
        }
         
        System.out.println("\nMatriz:");
        for (int i=0; i <5;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Média do "+(i + 1)+"º aluno: "+medias[i]);
            System.out.println(); 
        } 
        
        for (int i=0; i <5;i++) {
                if (medias[i] < 7) {
                    System.out.println("O aluno "+(i+1)+" foi reprovado pois teve média abaixo de 7!");
                } else {
                    System.out.println("O aluno "+(i+1)+" foi aprovado pois teve média acima de 7!");
                }
            }
        read.close();
    }
}