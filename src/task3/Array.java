package task3;

public class Array {
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 44, 55};
        System.out.print("Массив: " );
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" " );
        }
        int tmp = nums[0];
        nums[0] = nums[4];
        nums[4] = tmp;
        System.out.println();
        System.out.print("Массив после обмена мест: " );
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int sum = nums[0] + nums[2];
        System.out.println("Сумма первого и третьего элемента = "+sum);
    }
}
