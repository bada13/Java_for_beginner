package task8;
import java.util.Scanner; // импорт сканнера

public class cycle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите любое целое положительное число: ");
        int nums = input.nextInt();
        while (nums  < 0){
            System.out.print("Введите любое целое положительное число: ");
            nums = input.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= nums; i++) {
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.print("Сумма = " + sum);
    }
}
