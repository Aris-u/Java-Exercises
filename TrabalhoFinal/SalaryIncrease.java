package TrabalhoFinal;

import java.util.Scanner;

public class SalaryIncrease {

    public float getReajuste(float salario) {
        float reajuste = 0;

        if (salario <= 400) {
            reajuste = 0.15f;
        } else if (salario <= 800) {
            reajuste = 0.12f;
        } else if (salario <= 1200) {
            reajuste = 0.10f;
        } else if (salario <= 2000) {
            reajuste = 0.07f;
        } else if (salario > 2000) {
            reajuste = 0.04f;
        }
        return reajuste;
    }
    
    public void calculo(float salario, float reajuste) {
        float novoSalario = salario + (salario * reajuste);
        float reajusteGanho = novoSalario - salario;
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f%%\n", reajuste * 100);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SalaryIncrease si = new SalaryIncrease();

        System.out.println("Bem-vindo");
        System.out.print("Insira o seu salario: ");
        float salario = in.nextFloat();

        si.calculo(salario, si.getReajuste(salario));

        in.close();
    }
}

