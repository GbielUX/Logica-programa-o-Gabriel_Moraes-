import java.util.*;

public class Estudos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = in.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = in.nextShort();

        System.out.println("Olá, " + nome + " Você tem " + idade + " anos");
    }
}
