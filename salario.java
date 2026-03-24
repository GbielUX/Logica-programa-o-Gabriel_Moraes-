import java.util.Scanner;

public class salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== ENTRADA DE DADOS =====
        System.out.println("=== CÁLCULO DE SALÁRIO ===");

        System.out.print("Digite o salário base: R$ ");
        double salarioBase = sc.nextDouble();

        System.out.print("Digite o valor do bônus: R$ ");
        double bonus = sc.nextDouble();

        // ===== PROCESSAMENTO =====
        double salarioFinal = salarioBase + bonus;
        double desconto = salarioFinal * 0.02;
        double salarioLiquido = salarioFinal - desconto;

        // ===== SAÍDA DE DADOS =====
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Salário base: R$ %.2f\n", salarioBase);
        System.out.printf("Bônus: R$ %.2f\n", bonus);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);
        System.out.printf("Desconto (2%%): R$ %.2f\n", desconto);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}