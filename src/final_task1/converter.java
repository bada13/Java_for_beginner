package final_task1;
import java.util.Scanner; // импорт сканнера

public class converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввести текущий курс: ");
        double course = input.nextDouble();
        System.out.print("Ввести количество рублей: ");
        double rub = input.nextDouble();

        double tmp = rub/course;

        //Сделал два варианта.
        //Первый. Если последний 0 то он удаляется
        //Второй. Нашел когда искал решение для первого, как не удалять 0
        double result = Math.round(100.0 * tmp) / 100.0;
        System.out.println("Итого: " + result + " долларов");

        String result2 = String.format("%.2f",tmp);
        System.out.println("Итого: " + result2 + " долларов");
    }
}
