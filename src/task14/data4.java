package task14;
import java.util.Random;

public class data4 {
    public static void main(String[] args) {
        int size = 15;

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 41) - 20);
        }

        int max = array[0];
        int min = array[0];
        for(int i = 0; i != array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        if (Math.abs(max) == Math.abs(min)){
            System.out.println("Значения равны по модулю");
        } else { if (Math.abs(max) > Math.abs(min)){
            System.out.println("Наибольшее значение по модулю: " + max);
        }else {
            System.out.println("Наибольшее значение по модулю: " + min);
        }
        }
    }
}
