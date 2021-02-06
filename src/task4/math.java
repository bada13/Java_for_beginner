package task4;
import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите х = ");
        float x = in.nextFloat();

        System.out.print("Введите y = ");
        float y = in.nextFloat();

        System.out.print("Введите z = ");
        float z = in.nextFloat();

        float arif;
        arif = (x+y+z)/3;
        System.out.println("среднее арифметическое = "+arif);

        int result = (int)Math.floor(arif/2);
        System.out.println("среднее арифметическое разделенное 2 и округленное в меньшую сторону = "+result);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Программа выполнена НЕ корректно");
        }
    }
}
