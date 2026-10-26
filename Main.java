import  java.util.Arrays;
import  java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[15];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Початковий масив: "
                + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
            System.out.println("Відсортований масив: "
                    + Arrays.toString(numbers));
            System.out.print("Введіть число для пошуку (1-100): ");
            int target = scanner.nextInt();
            int left = 0;
            int right = numbers.length - 1;
            int foundIndex = -1;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (numbers[middle] == target) {
                    foundIndex = middle;
                    break;
                } else if (numbers[middle] < target)
                {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
                if (foundIndex != -1) {
                    System.out.println("Індекс числа " + target
                            + " у відсортованому масиві: " + foundIndex);
                } else {
                    System.out.println("Числа " + target + " немає у масиві.");
                }

                scanner.close();
                    }
                }






