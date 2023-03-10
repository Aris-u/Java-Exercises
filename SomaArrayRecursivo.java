import java.util.Scanner;

public class SomaArrayRecursivo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanhoArray;
        int[] array;
        int indice;
        
        // Solicita o tamanho do array ao usuário
        System.out.print("Digite o tamanho do array: ");
        tamanhoArray = input.nextInt();
        array = new int[tamanhoArray];
        
        // Solicita os números que compõem o array ao usuário
        System.out.println("Digite os números do array:");
        for(int i = 0; i < tamanhoArray; i++) {
            System.out.print("Número " + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        
        // Solicita o índice a partir do qual a soma deve começar
        System.out.print("Digite o índice a partir do qual a soma deve começar: ");
        indice = input.nextInt();
        
        // Chama a função recursiva para somar os elementos do array
        int soma = somarRecursivamente(array, indice);
        
        // Imprime o resultado da soma
        System.out.println("A soma dos elementos do array a partir do índice " + indice + " é: " + soma);
        
        input.close();
    }
    
    public static int somarRecursivamente(int[] array, int indice) {
        // Caso base: array vazio ou índice fora dos limites
        if(array == null || indice < 0 || indice >= array.length) {
            return 0;
        }
        // Passo recursivo: soma o elemento atual com a soma dos demais elementos a partir do próximo índice
        return array[indice] + somarRecursivamente(array, indice + 1);
    }
}
