import java.util.Scanner;

public class ADO2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        float salarioBase = 545;
        String[] produtos = {"Cola quente", "Tesoura de arremate", "Estilete", "Régua de metal", "Lápis de marcação", "Pincel de cerdas naturais", "Tinta acrílica", "Tecido de algodão", "Fita dupla face", "Agulha de bordado"};
        int[] quantidadeVendida = new int[produtos.length];
        float[] valorUnitario = new float[produtos.length];
        float[] maisVendido = new float[produtos.length];
        float total = 0;
        float totalG = 0;
        float comissao =0;


        for (int i = 0; i < produtos.length ; i++) {

            System.out.println("Digite o valor unitario do produto : " + produtos[i]);
            valorUnitario[i] = scanner.nextFloat();

            System.out.println("Digite a quantidade vendida de " +produtos[i]);
                quantidadeVendida[i] = scanner.nextInt();
        }



        for (int i = 0; i < valorUnitario.length; i++) {
            total = (valorUnitario[i] * quantidadeVendida[i]);
            totalG += total;

            System.out.print("ID : " + i +"| Quantidade vendida de " +produtos[i] + " | total vendido : " +quantidadeVendida[i] + " | ");
            System.out.print("Valor Unitario de:  " +valorUnitario[i]);
            System.out.print(" | Valor total vendido de " +produtos[i]+  " é igual á = " + total);
            System.out.println("");
            System.out.println("");
            maisVendido[i] = total;

        }

        System.out.println("-----------------------------");
        System.out.println("Total Geral das vendas: " +totalG);
        comissao = (totalG / 100 * 5);
        System.out.printf("Comissão do vendedor: %.2f%n", comissao);
        System.out.printf("Salário final do vendedor: %.2f%n", salarioBase + comissao);


        int indiceMaisVendido = 0;
        float MaiorPreco = maisVendido[0];
        for (int i = 0; i < maisVendido.length ; i++) {
            if (maisVendido[i] > MaiorPreco ){
                MaiorPreco = maisVendido[i];
                indiceMaisVendido = i;
            }

        }

        System.out.println("O valorUnitario total do Item mais vendido : " + MaiorPreco + " | E o indice dele na lista de produtos é o ID " +indiceMaisVendido );
         scanner.close();
    }


}

