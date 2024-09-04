import java.util.Scanner;

public class MultiMaTeste {
    public static void main(String[] args) {

        int [][] primeiraMatriz = {
                {2,3,-1},
                {4,-2,5}
        };

        int [][] segundaMatriz = {
                {2,-1,0,6},
                {1,3,-5,1},
                {4,1,-2,2}
        };

        int linhasPrimeiras = primeiraMatriz.length;
        int colunasPrimeiras = primeiraMatriz[0].length; // Número de colunas da primeira matriz
        int colunasSegundas = segundaMatriz[0].length; // Número de colunas da segunda matriz

        int[][] resultado = new int[linhasPrimeiras][colunasSegundas];

        for (int i = 0; i < linhasPrimeiras; i++) {
            for (int j = 0; j < colunasSegundas; j++) {
                for (int k = 0; k < colunasPrimeiras; k++) { // Percorre as colunas da primeira matriz
                    resultado[i][j] += primeiraMatriz[i][k] * segundaMatriz[k][j];
                }
            }
        }


        for (int i = 0; i < resultado.length ; i++) {
            for (int j = 0; j < resultado[0].length ; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println("");
        }

    }
}


/*a primeira matriz de ordem 4 x 5 e uma segunda matriz 5 x 2*/

/* Quando multiplicamos duas matrizes, cada elemento da matriz resultante é a soma das multiplicações dos elementos correspondentes das linhas da primeira matriz com as colunas da segunda matriz. O terceiro loop é responsável por realizar essa soma dos produtos.
Vamos ver um exemplo simples para ilustrar:
Suponha que temos as seguintes matrizes:

int [][] matriz1 = {
                {2,3,-1},
                {4,-2,5}
        };

int [][] matriz2 = {
                {2,-1,0,6},
                {1,3,-5,1},
                {4,1,-2,2}
                };


Para calcular o elemento  da matriz resultante ( C ):

matrizC = {3, 6, -13, 13}
        {26, -5, 0, 32}

Cada elemento da matriz resultante depende de todos os elementos da linha correspondente da primeira matriz e da coluna correspondente da segunda matriz.
Portanto, o terceiro loop é necessário para garantir que todos os produtos sejam somados corretamente para cada elemento da matriz resultante*/