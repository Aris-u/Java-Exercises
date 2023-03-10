import java.util.Scanner;

public class InverterStringRecursivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String palavra = input.nextLine();
        
        System.out.println("O que você gostaria de fazer?");
        System.out.println("1 - Inverter a string usando recursão");
        System.out.println("2 - Sair");
        
        int opcao = input.nextInt();
        input.nextLine(); // consumir a quebra de linha deixada pelo nextInt()
        
        switch(opcao) {
            case 1:
                String invertida = inverterRecursivamente(palavra);
                System.out.println("A palavra/frase invertida é: " + invertida);
                break;
            case 2:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        input.close();
    }
    
    public static String inverterRecursivamente(String palavra) {
        // Caso base: palavra vazia ou com apenas um caractere
        if(palavra.length() <= 1) {
            return palavra;
        }
        // Passo recursivo: inverte a substring que começa no segundo caractere e adiciona o primeiro caractere no final
        return inverterRecursivamente(palavra.substring(1)) + palavra.charAt(0);
        
    }
}