package task5;
import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’ = ");
        String name = in.nextLine();

        System.out.print("Введите первое число = ");
        float x = in.nextFloat();

        System.out.print("Введите второе числов = ");
        float y = in.nextFloat();

        float result;
        switch(name) {
            case "+":
                result = x+y;
                System.out.println("Результат сложения двух чисел = " + result);
                break; // останавливаем сравнение
            case "-":
                result = x-y;
                System.out.println("Результат вычитания двух чисел = " + result);
                break;
            case "*":
                result = x*y;
                System.out.println("Результат умножения двух чисел = " + result);
                break;
            case "/":
                result = x/y;
                System.out.println("Результат деления двух чисел = " + result);
                break;
            default:
                System.out.println("ввели не ‘+’, ‘-’, ‘*’ или ‘/’");
                break;
        }

    }
}
