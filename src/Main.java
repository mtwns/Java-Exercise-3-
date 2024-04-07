
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[4][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int o = 0; o < 5; o++) {
                numbers[i][o] = scanner.nextInt();
            }
        }

        System.out.println("Valores de la matriz:");
        for (int p = 0; p < numbers.length; p++) {
            for (int j = 0; j < numbers[p].length; j++) {
                System.out.print(numbers[p][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}