    import java.util.Scanner;


    public class ex4 {
        public static void main(String[] args) throws Exception {
            Scanner read = new Scanner(System.in);
            double[][] vendas = new double[3][3];

            for(int i=0; i<vendas.length; i++){
                double soma=0;
                for(int j=0; j<vendas[i].length; j++){
                    System.out.print("Escreva o valor das vendas do "+(i+1)+"º funcionário no "+(j+1)+"º mês: ");
                    vendas[i][j]=read.nextDouble();
                    soma=soma+vendas[i][j];
                }
                System.out.println("O valor total de vendas do "+(i+1)+"º funcionário nesse mês foi de R$"+soma);
            }
            System.out.println("Matriz completa: ");
            for(int i=0; i<vendas.length; i++){
                for(int j=0; j<vendas[i].length; j++){
                    System.out.print(vendas[i][j]+"\t");
                }
                System.out.println();
            }
            double maiorvenda = vendas[0][0];
            int funcionario=0;
            for(int i=0; i<vendas.length; i++){
                for(int j=0; j<vendas[i].length; j++){
                if(vendas[i][j]>maiorvenda){
                    maiorvenda=vendas[i][j];
                    funcionario=i;
                }
                
                }
                
            
        }
        System.out.println("O vendedor que fez a maior venda foi o "+(funcionario+1)+"º funcionário.");
        read.close();
        }
    }