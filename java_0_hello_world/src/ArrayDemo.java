import java.util.Arrays;

/**
 * @author jam
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 1. 创建一个数组
        int[] classArray = new int[10];
        classArray[0] = 1;
        classArray[2] = 1;

        boolean[] array1 = new boolean[5];
        array1[0] = true;

        System.out.println("array1: " + Arrays.toString(array1));

        // 数组遍历：1. for-each 循环
        for (int index : classArray) {
            System.out.println("index: " + index);
        }

        // 数组遍历：2. for循环
        for (int i = 0; i < array1.length; i++) {
            System.out.println("for-" + array1[i]);
        }

        // 2. 如何初始化数组
        // 静态初始化
        int[] array3 = {1, 2, 3, 4, 5, 8, 7, 6};

        System.out.println("array3: " + Arrays.toString(array3));

        for (int i = 0; i < array3.length; i++) {
            System.out.println("for3-" + array3[i]);
        }

        //
        int[] array4 = new int[10];
        array4[0] = 7;
        array4[1] = 1234;

        System.out.println("array4:" + Arrays.toString(array4));
    }
}
