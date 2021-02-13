package final_task4;
import java.util.Scanner; // импорт сканнера

public class puzzle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean help,exit,success;
        System.out.println ("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        help = false;
        exit = false;
        success = false;
        for(int i = 1; i <= 3; i++){
            if (exit) break;
            if (success) break;
            System.out.println ("Ответ " + i + " :");
            String answer = input.nextLine();
            switch (answer){
                case ("Заархивированный вирус"):
                    success = true;
                    break;
                case ("Подсказка"):
                    if (i == 1){
                        System.out.println ("Подсказка, правильный ответ: Заархивированный вирус");
                        help = true;
                    } else System.out.println ("Подсказка уже недоступна");
                    break;
                default:
                    if (help){
                        exit = true;
                        break;
                    }
                    if (i == 3) break;
                    System.out.println("Подумай еще!");
            }
        }
        if (success) System.out.println("Правильно!");
        else if (help) System.out.println("Обидно, приходи в другой раз");
        else System.out.println("Обидно, приходи в другой раз");
    }
}
