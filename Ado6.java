import java.util.Scanner;

public class Ado6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int codigo;

        System.out.println("Digite os 5 valores para o vetor");
        for (int i = 0; i < vetor1.length ; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 1 para ver o vetor na ordem direta");
        System.out.println("Digite 2 para ver o vetor na ordem inversa");
        System.out.println("Digite 0 para sair");
        codigo = scanner.nextInt();

        if (codigo == 0) {
            System.out.println("Você saiu do programa");
        } else if (codigo == 1) {
            System.out.print("Vetor na forma direta: ");
            for (int i = 0; i < vetor1.length; i++) {
                System.out.print(vetor1[i] + "  ");
            }
        } else if (codigo == 2) {
            System.out.print("Vetor na forma inversa: ");
            for (int i = vetor1.length - 1; i >= 0; i--) {
                System.out.print(vetor1[i] + "  ");
            }
        } else {
            System.out.println("Código inválido. Você saiu do programa.");
        }


        scanner.close();
    }
}
