public class ex6 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
             {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };
        int acima = 0;
        int abaixo = 0;
        int somabordas = 0;
        int numbordas = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < j) {
                    acima++;
                } else if (i> j) {
                    abaixo++;
                }
                
                if (i==0 || i==5 || j==0 || j==5) {
                    somabordas += matriz[i][j];
                    numbordas++;
                }
            }
        }
        double media=(double) somabordas/ numbordas;
        System.out.println("Acima: "+acima);
        System.out.println("Abaixo: "+abaixo);
        System.out.println("Media bordas: "+media);
    }
}