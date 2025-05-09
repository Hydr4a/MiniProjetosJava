import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite números de 1 a 4:");

        for(int i = 0;i<4;i++){
            for (int j = 0 ; j < 4 ; j++){
                System.out.print("[" + i + "] [" + j + "]: ");
                int valor = read.nextInt();
                while(valor<1 || valor > 4){
                    System.out.print("Valor inválido. Digite entre 1 e 4: ");
                    valor = read.nextInt( );
                }
                matriz[i][j] = valor;
            }
        }

        boolean linhasvalidas = true ;
        for (int i = 0; i<4 ; i++ ){
            boolean[] seen = new boolean[5] ;
            for(int j =0;j<4;j++){
                if(seen[ matriz[i][j] ]){
                    linhasvalidas=false; break;
                }
                seen[ matriz[i][j] ] = true ;
            }
        }

        boolean colunasvalidas = true;
        for (int j=0; j<4;j++){
            boolean [] seen = new boolean[5];
            for (int i=0;i<4;i++){
                if ( seen[matriz[i][j]] ){
                    colunasvalidas = false; break ;
                }
                seen[matriz[i][j]] = true;
            }
        }

        System.out.println("\nMatriz:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print( matriz[i][j] + "\t" ) ;
            }
            System.out.println();
        }

        if(linhasvalidas && colunasvalidas){
            System.out.println("Preenchimento válido!");
        }else{
            System.out.println("Preenchimento inválido!");
        }
        read.close();
    }
}
