public class ex7 {
    public static void main(String[] args) {
        int[][] matriz = {
            {12, 7, 45, 22, 89, 3},
            {6, 17, 30, 51, 40, 11},
            {28, 33, 15, 60, 71, 5},
            {2, 27, 13, 8, 66, 39},
            {91, 81, 24, 18, 77, 36},
            {1, 10, 9, 52, 43, 99}
        };
        int pares = 0;
        int impares = 0;
        int multiplos3 = 0;

        System.out.println("Matriz completa:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int valor = matriz[i][j];
                System.out.print(valor + "\t");

                if (valor%2==0) {
                    pares++;
                } else {
                    impares++;
                }
                if (valor%3==0) {
                    multiplos3++;
                }
            }
            System.out.println();
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Quantidade de múltiplos de 3: " + multiplos3);
    }
}
