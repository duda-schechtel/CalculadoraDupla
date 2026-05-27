package operacoes;
import java.util.Scanner;


public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.pow(x, y));
    }
}
