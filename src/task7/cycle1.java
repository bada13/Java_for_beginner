package task7;
import java.util.Scanner; // импорт сканнера

public class cycle1 {
    public static void main(String[] args) {
        int x,y,z; //константы x, y, z
        x = 1;
        y = 2;
        z = 3;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во элементов в массиве: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i+1) + " элемент массива :");
            array[i] = input.nextInt();
        }

        int i = 0;
        do {
            if (array[i] == x || array[i] == y || array[i] == z){
                System.out.print ("Данное значение имеется в константах");
                break;
            }
            i++;
        } while (i < size);
    }
}
