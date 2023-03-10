import java.util.Scanner;

public class VerificaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];
        
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.print("Digite o número a ser buscado: ");
        int numero = sc.nextInt();

        if (incluiNumero(array, numero)) {
            System.out.println("O número " + numero + " está presente no array.");
        } else {
            System.out.println("O número " + numero + " não está presente no array.");
        }
        
        sc.close();
    }

    public static boolean incluiNumero(int[] arr, int num) {
        // Caso base: se o array estiver vazio, retorna falso
        if (arr.length == 0) {
            return false;
        }

        // Caso base: se o primeiro elemento do array for igual ao número, retorna verdadeiro
        if (arr[0] == num) {
            return true;
        }

        // Chamada recursiva: verifica se o array sem o primeiro elemento contém o número
        int[] novoArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            novoArr[i-1] = arr[i];
        }
        return incluiNumero(novoArr, num);
    }
}
