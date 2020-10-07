/*1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
 Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.

        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
*/

import java.util.logging.Logger;

public class One {

    private static final Logger logger = Logger.getLogger(One.class.getName());

    public static void main(String[] args) {
        int[] One = one(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});
        System.out.println(One);
    }

    public static int[] one (int[] arr) {
        int[] bArr = new int[2];
        if(arr.length == 0) {
            logger.info("no");
            return arr;
        }
        for (int i = arr.length - 3; i >= 0 ; i--) {
            if(arr[i] == 4) {
                System.arraycopy(arr, (i+1), bArr,0,2);
                return bArr;
            }
        }
        throw new RuntimeException("RuntimeException");
    }
}


