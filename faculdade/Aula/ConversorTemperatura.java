import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Exibe o resultado
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}