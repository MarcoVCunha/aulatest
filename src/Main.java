import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String entrada = scanner.nextLine();

        System.out.println("Você digitou: " + entrada);

        scanner.close();

    }
}