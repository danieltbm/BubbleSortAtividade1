package Visao;
import java.util.Scanner;

public class SortView {
    public void printSortedArray(int[] numbers) {
        System.out.println("Array Ordenado: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
    
    public int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + "º: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }
}