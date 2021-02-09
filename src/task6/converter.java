package task6;
import java.util.Scanner; // импорт сканнера

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        byte phrase1 = sc.nextByte();
        byte phrase2; //переменная для мер величин
        float phrase3; //переменная для числа

        if (phrase1 == 1){
            System.out.print("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт , 4 - тонна : ");
            phrase2 = sc.nextByte();

            System.out.print("Введите число: ");
            phrase3 = sc.nextFloat();

            switch(phrase2) {
                case 1:
                    System.out.println("Килограмм = " + phrase3);
                    System.out.println("Унция = " + phrase3*35.2739);
                    System.out.println("Фунт = " + phrase3*2.2046);
                    System.out.println("Тонна = " + phrase3*0.001);
                    break;
                case 2:
                    System.out.println("Килограмм = " + phrase3*0.0283);
                    System.out.println("Унция = " + phrase3);
                    System.out.println("Фунт = " + phrase3*0.0625);
                    System.out.println("Тонна = " + phrase3*0.00002);
                    break;
                case 3:
                    System.out.println("Килограмм = " + phrase3*0.4535);
                    System.out.println("Унция = " + phrase3*15.9999);
                    System.out.println("Фунт = " + phrase3);
                    System.out.println("Тонна = " + phrase3*0.0004);
                    break;
                case 4:
                    System.out.println("Килограмм = " + phrase3*1000);
                    System.out.println("Унция = " + phrase3*35273.9619);
                    System.out.println("Фунт = " + phrase3*2204.6226);
                    System.out.println("Тонна = " + phrase3);
                    break;
                default:
                    System.out.println("Упс! Что-то пошло не так...");
                    break;
            }
        }

        if (phrase1 == 2){
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
            phrase2 = sc.nextByte();

            System.out.print("Введите число: ");
            phrase3 = sc.nextFloat();

            switch(phrase2) {
                case 1:
                    System.out.println("Метр = " + phrase3);
                    System.out.println("Миля = " + phrase3*0.0006);
                    System.out.println("Ярд = " + phrase3*1.0936);
                    System.out.println("Фут = " + phrase3*3.2808);
                    break;
                case 2:
                    System.out.println("Метр = " + phrase3*1609.3439);
                    System.out.println("Миля = " + phrase3);
                    System.out.println("Ярд = " + phrase3*1759.999);
                    System.out.println("Фут = " + phrase3*5279.9999);
                    break;
                case 3:
                    System.out.println("Метр = " + phrase3*0.9144);
                    System.out.println("Миля = " + phrase3*0.00056);
                    System.out.println("Ярд = " + phrase3);
                    System.out.println("Фут = " + phrase3*3.0000);
                    break;
                case 4:
                    System.out.println("Метр = " + phrase3*0.3048);
                    System.out.println("Миля = " + phrase3*0.0002);
                    System.out.println("Ярд = " + phrase3*0.3333);
                    System.out.println("Фут = " + phrase3);
                    break;
                default:
                    System.out.println("Упс! Что-то пошло не так...");
                    break;
            }
        }
    }
}
