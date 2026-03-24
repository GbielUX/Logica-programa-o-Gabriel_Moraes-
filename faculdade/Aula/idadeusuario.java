import java.util.Scanner;

public class idadeusuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        // Cálculo das idades
        int idade2026 = 2026 - anoNascimento;
        int idade2050 = 2050 - anoNascimento;

        // Saída
        System.out.println(nome + ", sua idade em 2026 é " + idade2026);
        System.out.println(nome + ", sua idade em 2050 será " + idade2050);

        sc.close();
    }
}