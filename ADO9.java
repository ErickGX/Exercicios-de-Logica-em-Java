import java.util.Random;

public class ADO9 {
    public static void main(String[] args) {

        int[][] matriz7x7 = new int[7][7];
        int[] vetorLinha = new int[7];
        int[] vetorColuna = new int[7];

            Random random = new Random();
            for (int i = 0; i < matriz7x7.length; i++) {
                for (int j = 0; j < matriz7x7[i].length; j++) {
                    matriz7x7[i][j] = random.nextInt(100);
                }
            }


        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7[i].length; j++) {
                System.out.print(matriz7x7[i][j] + " | ");
            }
            System.out.println("  ");
        }
        System.out.println(" ");
        System.out.println("----------Array com os maiores valores de cada Linha------------");



        for (int i = 0; i < matriz7x7.length; i++) {
            int maiorValor= matriz7x7[i][0];
            for (int j = 0; j < matriz7x7[i].length; j++) {
                if (matriz7x7[i][j] > maiorValor){
                         maiorValor = matriz7x7[i][j];
                    }
            }
                 vetorLinha[i] = maiorValor;
            }


        for (int i = 0; i < vetorLinha.length; i++) {
            System.out.print(vetorLinha[i] + "  ");

        }

        System.out.println(" ");
        System.out.println("----------Array com os menores valores de cada Coluna------------");



        for (int j = 0; j < matriz7x7[0].length; j++) {
            int menorValor = matriz7x7[0][j];
            for (int i = 0; i < matriz7x7.length; i++) {
                if (matriz7x7[i][j] < menorValor){
                    menorValor = matriz7x7[i][j];
                }

            }
            vetorColuna[j] = menorValor;
        }


        for (int i = 0; i < vetorColuna.length; i++) {
            System.out.print(vetorColuna[i] + "  ");

        }

    }
}