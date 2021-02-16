package task13;
import java.util.Scanner; // импорт сканнера

public class data3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввести строку: ");
        String text = input.nextLine();
        String[] words = text.split("\\s+");

        System.out.println("Слова состоящие только из латиницы:");
        int count = 0;
        for(int j=0; j< words.length;j++){
            if (words[j].matches("[a-zA-Z]+")){
                System.out.println(words[j]);
                count++;
            }
        }
        System.out.println("Количество этих слов: " + count);
    }
}
