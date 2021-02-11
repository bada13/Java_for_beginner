package task11;
import java.util.Scanner; // импорт сканнера

public class data1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввести первое число: ");
        String num1 = input.nextLine();

        System.out.print("Ввести второе число: ");
        int num2 = input.nextInt();

        int tmp1 = Integer.parseInt(num1);

        System.out.println("Большее из чисел: " + Math.max(tmp1,  num2));

        //Сделал два варианта. Какой из них корректный?
        //Оба выводят значение с плавающей точкой.
        int min = Math.min(tmp1,  num2);
        double tmp2 = Double.valueOf (min);
        System.out.println("Меньшее из чисел: " + tmp2);

        double tmp3 = Math.min(tmp1,  num2);
        System.out.println("Меньшее из чисел: " + tmp3);

    }
}
