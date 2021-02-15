package task11;
import java.util.Scanner; // импорт сканнера

public class data1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввести первое число: ");
        String num1 = input.nextLine();

        System.out.print("Ввести второе число: ");
        int num2 = input.nextInt();

        double tmp1 = Double.parseDouble(num1);
        double tmp2= Double.valueOf(num2);

        System.out.println("Большее из чисел: " + Math.max(tmp1,  tmp2));
        System.out.println("Меньшее из чисел: " + Math.min(tmp1,  tmp2));
    }
}
