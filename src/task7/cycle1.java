package task7;
import java.util.Scanner; // импорт сканнера

public class cycle1 {
    public static void main(String[] args) {
        String q,w,e; //константы q,w,e
        q = "qq";
        w = "ww";
        e = "ee";

        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во элементов в массиве: ");
        int size = input.nextInt();

        input.nextLine();
        String[] array2 = new String[size];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Введите " + (i+1) + " элемент массива :");
            array2[i] = input.nextLine();
        }

        for (String s : array2){
            if (s.equals(q)) {
                System.out.print("Данное значение имеется в константах");
                break;
            }
            if (s.equals(w)) {
                System.out.print("Данное значение имеется в константах");
                break;
            }
            if (s.equals(e)) {
                System.out.print("Данное значение имеется в константах");
                break;
            }
        }
    }
}
