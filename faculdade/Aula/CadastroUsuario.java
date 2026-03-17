import java.util.*;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Nome
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();

        // Idade com validação
        int idade = 0;
        while (true) {
            try {
                System.out.print("Digite sua idade: ");
                idade = Integer.parseInt(in.nextLine());

                if (idade <= 0) {
                    System.out.println("Idade inválida. Tente novamente.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
            }
        }

        // Altura
        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        double altura = Double.parseDouble(in.nextLine());

        // Peso
        System.out.print("Digite seu peso (em kg): ");
        double peso = Double.parseDouble(in.nextLine());

        // Cálculo de IMC
        double imc = peso / (altura * altura);

        // Classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        // Resultado final
        System.out.println("\n===== RESULTADO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        // Mensagem personalizada
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }

        in.close();
    }
}