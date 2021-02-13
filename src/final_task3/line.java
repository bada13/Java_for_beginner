package final_task3;
import java.util.Scanner; // импорт сканнера

public class line {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int size = input.nextInt();
        input.nextLine();
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите строку : ");
            array[i] = input.nextLine();
        }

        String tmp1 = null;
        long tmp2 = 1;
        long num = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == tmp2){
                System.out.println("Уникальная строка: " + tmp1);
            }
            num = array[i].chars().distinct().count();
            if (num > tmp2){
                tmp2 = num;
                tmp1 = array[i];
            }
        }
    }

}
