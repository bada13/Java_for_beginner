package task9;
import java.util.Scanner; // импорт сканнера

public class cycle3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во элементов в массиве: ");
        int size = input.nextInt();

        double sum = 0;
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i+1) + " элемент массива :");
            array[i] = input.nextDouble();
            sum = sum + array[i];
        }
        double arif;
        arif = sum / size;
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее арифметическое  = " + arif);

        System.out.println("Каждый элемент массива умножается на " + arif);
        for (int i = 0; i < size; i++) {
            System.out.print((array[i] * arif) + " ");
        }
    }
}
