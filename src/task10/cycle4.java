package task10;
import java.util.Scanner; // импорт сканнера

public class cycle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во строк матрицы: ");
        int line = input.nextInt();
        System.out.print("Введите кол-во столбцов матрицы: ");
        int column  = input.nextInt();

        int[][] matrix = new int[line][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Введите элемент матрицы[" + (i+1) + "][" + (j+1) + "]:");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Вы ввели следующую матрицу:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Первая строка умноженная на 3:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0){
                    System.out.print(((matrix[i][j])*3)+ " ");
                } else break;
            }
        }
    }
}
