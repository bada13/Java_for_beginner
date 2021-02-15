package task13;
import java.util.Scanner; // импорт сканнера

public class data3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввести строку: ");
        String text = input.nextLine();

        String str1;
        str1 = text.replaceAll("[а-яА-Я\\d]", "").replaceAll("[-+*/,.?!]", "");
        System.out.println("Слова состоящие только из латиницы: " + str1);

        int length=str1.split("\\s+").length;
        int count = 1;
        for (int i=0;i<=str1.length()-1;i++)
        {
            if (str1.charAt(i) == ' ' && str1.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println("Слова: " + count);
        System.out.println("Слова: " + length);
    }
}
