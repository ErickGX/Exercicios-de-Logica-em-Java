
public class ADO1 {
    public static void main(String[] args) {
        int[] numeros = {6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int numero : numeros) {
            if (isPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
