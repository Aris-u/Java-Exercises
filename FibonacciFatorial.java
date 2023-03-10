import java.util.Scanner;

public class FibonacciFatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para o qual deseja calcular o fatorial: ");
        int numeroFatorial = sc.nextInt();

        System.out.print("Digite o número para o qual deseja calcular a série de Fibonacci: ");
        int numeroFibonacci = sc.nextInt();

        System.out.print("Digite o número de vezes que deseja executar os cálculos: ");
        int numeroIteracoes = sc.nextInt();

        long startTimeNano = System.nanoTime();
        long startTimeMillis = System.currentTimeMillis();

        long tempoTotalExecucaoNano = 0;
        long tempoTotalExecucaoMillis = 0;

        for (int i = 0; i < numeroIteracoes; i++) {
            long tempoInicial = System.nanoTime();

            int fatorial = calculaFatorial(numeroFatorial);
            int fibonacci = calculaFibonacci(numeroFibonacci);

            long tempoFinal = System.nanoTime();

            long tempoExecucaoNano = tempoFinal - tempoInicial;
            long tempoExecucaoMillis = System.currentTimeMillis() - startTimeMillis;

            tempoTotalExecucaoNano += tempoExecucaoNano;
            tempoTotalExecucaoMillis += tempoExecucaoMillis;

            System.out.println("Fatorial de " + numeroFatorial + ": " + fatorial);
            System.out.println("Série de Fibonacci de " + numeroFibonacci + ": " + fibonacci);
            System.out.println("Tempo de execução em nanosegundos: " + tempoExecucaoNano);
            System.out.println("Tempo de execução em milissegundos: " + tempoExecucaoMillis);
            System.out.println("------------------------");
        }

        long endTimeNano = System.nanoTime();
        long endTimeMillis = System.currentTimeMillis();

        double mediaTempoExecucaoNano = (double) tempoTotalExecucaoNano / numeroIteracoes;
        double mediaTempoExecucaoMillis = (double) tempoTotalExecucaoMillis / numeroIteracoes;

        System.out.println("Tempo total de execução em nanosegundos: " + (endTimeNano - startTimeNano));
        System.out.println("Tempo total de execução em milissegundos: " + (endTimeMillis - startTimeMillis));
        System.out.println("Média de tempo de execução em nanosegundos: " + mediaTempoExecucaoNano);
        System.out.println("Média de tempo de execução em milissegundos: " + mediaTempoExecucaoMillis);

        sc.close();
    }

    public static int calculaFatorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static int calculaFibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }

        if (numero == 1 || numero == 2) {
            return 1;
        }

        int fib1 = 1;
        int fib2 = 1;
        int fibonacci = 0;

        for (int i = 3; i <= numero; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }

        return fibonacci;
    }
}
