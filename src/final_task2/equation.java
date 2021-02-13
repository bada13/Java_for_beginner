package final_task2;
import java.util.Scanner; // импорт сканнера

public class equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equa = null;
        int len;
        char c1 = 0, c2 = 0, c3 = 0, c4, c5 = 0;
        boolean success = false;
        int result = 666;

        System.out.println ("Программа принимает на вход строку длиной 5 символов.");
        System.out.println ("Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.");
        System.out.println ("Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (латинская) в любом порядке.");
        while (!success){
            do {
                System.out.println ("Введите уравнение: ");
                equa = input.nextLine();
                len = equa.length();
            } while (len != 5);

            c1 = equa.charAt(0);
            c2 = equa.charAt(1);
            c3 = equa.charAt(2);
            c4 = equa.charAt(3);
            c5 = equa.charAt(4);

            if (Character.isDigit(c1)){
                if (Character.isDigit(c3)){
                    if (c5 == 'x'){
                        if (c2 == '+' || c2 == '-'){
                            if (c4 == '=') success = true;
                        }
                    }
                }
            }

            if (Character.isDigit(c3)){
                if (Character.isDigit(c1)){
                    if (c5 == 'x'){
                        if (c2 == '+' || c2 == '-'){
                            if (c4 == '=') success = true;
                        }
                    }
                }
            }

            if (Character.isDigit(c3)){
                if (Character.isDigit(c5)){
                    if (c1 == 'x'){
                        if (c2 == '+' || c2 == '-'){
                            if (c4 == '=') success = true;
                        }
                    }
                }
            }

            if (Character.isDigit(c5)){
                if (Character.isDigit(c3)){
                    if (c1 == 'x'){
                        if (c2 == '+' || c2 == '-'){
                            if (c4 == '=') success = true;
                        }
                    }
                }
            }

            if (Character.isDigit(c1)){
                if (Character.isDigit(c5)){
                    if (c3 == 'x'){
                        if (c2 == '+' || c2 == '-'){
                            if (c4 == '=') success = true;
                        }
                    }
                }
            }

            if (Character.isDigit(c5)){
                if (Character.isDigit(c1)){
                    if (c3 == 'x'){
                        if (c2 =='+' || c2 == '-'){
                            if (c4 == '=') success = true;
                        }
                    }
                }
            }
        }

        switch (c2){
            case ('+'):
                if (c1 == 'x')
                    result = Character.getNumericValue(c5) - Character.getNumericValue(c3);
                if (c3 == 'x')
                    result = Character.getNumericValue(c5) - Character.getNumericValue(c1);
                if (c5 == 'x')
                    result = Character.getNumericValue(c1) + Character.getNumericValue(c3);
                break;
            case ('-'):
                if (c1 == 'x')
                    result = Character.getNumericValue(c5) + Character.getNumericValue(c3);
                if (c3 == 'x')
                    result = Character.getNumericValue(c1) + Character.getNumericValue(c5);
                if (c5 == 'x')
                    result = Character.getNumericValue(c1) - Character.getNumericValue(c3);
                break;
            default:
                System.out.println ("Упс!!! Что то пошло не так " + result);
        }
        System.out.println ("Вы ввели следующее уравнение:\n" + equa);
        System.out.println ("Ответ: x=" + result);
    }
}
