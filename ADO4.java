import java.util.Random;

/*
Crie um programa que preencha uma primeira matriz de ordem 4 x 5 e uma segunda matriz 5 x 2.
O programa deverá, também, calcular e mostrar a matriz resultante do produto matricial das duas matrizes anteriores, armazenando-o em uma terceira matriz de ordem 4 x 2.
 */
public class ADO4 {
    public static void main(String[] args) {
        int[][][] matrizes = geradorMatriz();

        int[][] resultado = multiMatriz(matrizes[0], matrizes[1]);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + "  ");
            }
            System.out.println("");
        }


        System.out.println("Bonus:  acessando um valor especifico dentro da Matriz Tridimensional (3D)");
        System.out.println(matrizes[0][1][2] + " : posicao correspondente a MATRIZ 1 - [1][2]");


    }

    public static int[][][] geradorMatriz() {
        Random random = new Random();
        int[][] matriz1 = new int[4][5];
        int[][] matriz2 = new int[5][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = random.nextInt(20);
            }
        }


        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = random.nextInt(20);
            }
        }

        /*Exibir a matrizes geradas */


        System.out.println("Matriz 1 :");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("------------------------------");


        System.out.println("Matriz 2 :");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");

        }

        System.out.println("------------------------------");

        return new int[][][]{matriz1, matriz2};
    }

    public static int[][] multiMatriz(int[][] primeiraMatriz, int[][] segundaMatriz) {


        int linhasPrimeiras = primeiraMatriz.length;
        int colunasSegundas = segundaMatriz[0].length; // Número de colunas da segunda matriz
        int colunasPrimeiras = primeiraMatriz[0].length; // Número de colunas da primeira matriz


        int[][] resultado = new int[linhasPrimeiras][colunasSegundas];

        for (int i = 0; i < linhasPrimeiras; i++) {
            for (int j = 0; j < colunasSegundas; j++) {
                for (int k = 0; k < colunasPrimeiras; k++) { // Percorre as colunas da primeira matriz
                    resultado[i][j] += primeiraMatriz[i][k] * segundaMatriz[k][j];
                }
            }
        }
        return resultado;
    }


}




/*a primeira matriz de ordem 4 x 5 e uma segunda matriz 5 x 2*/

/* Quando multiplicamos duas matrizes, cada elemento da matriz resultante é a soma dos produtos dos elementos correspondentes das linhas da primeira matriz com as colunas da segunda matriz. O terceiro loop é responsável por realizar essa soma dos produtos.
Vamos ver um exemplo simples para ilustrar:
Suponha que temos as seguintes matrizes:

A=({1,2,3}
    {4,5,6}
);

B=( {7,8}
    {9,10},
    {11,12}
);


Para calcular os elementos da matriz resultante ( C ):

C = {
    {58 , 64},
    {139 , 154}
};

Cada elemento da matriz resultante depende de todos os elementos da linha correspondente da primeira matriz e da coluna correspondente da segunda matriz.
Portanto, o terceiro loop é necessário para garantir que todos os produtos sejam somados corretamente para cada elemento da matriz resultante*/