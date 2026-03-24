import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor do bônus: ");
        double bonus = sc.nextDouble();

        // Cálculo do salário final
        double salarioFinal = salario + bonus;

        // Desconto de 2%
        double desconto = salarioFinal * 0.02;

        // Salário líquido
        double salarioLiquido = salarioFinal - desconto;

        // Saída
        System.out.println("Salário líquido do funcionário: R$ " + salarioLiquido);

        sc.close();
    }
}