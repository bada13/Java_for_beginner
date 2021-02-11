package task12;
import java.util.Scanner; // импорт сканнера

public class data2 {
    public static void main(String[] args) {
        String text = "I like Java!!!";

        boolean got1 = text.contains("Java");
        if (got1){
            System.out.println("В строке есть 'Java' : ");
        } else System.out.println("В строке нет 'Java' : ");

        boolean got2 = text.startsWith("I like");
        if (got2){
            System.out.println("Строка начинается с 'I like'");
        } else System.out.println("Строка не начинается на 'I like'");

        boolean got3 = text.endsWith("!!!");
        if (got3){
            System.out.println("Строка заканчивается на '!!!'");
        } else System.out.println("Строка не заканчивается на '!!!'");

        if (got1 && got2 && got3){
            System.out.println("Строка в верхнем регистре: " + text.toUpperCase());
        }

        String replace = text.replace('a',  'o');
        System.out.println(replace.substring(7, 11));
    }
}
