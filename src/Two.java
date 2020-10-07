/*2. Написать метод, который проверяет состав массива из чисел 1 и 4.
Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        [ 1 1 1 4 4 1 4 4 ] -> true
        [ 1 1 1 1 1 1 ] -> false
        [ 4 4 4 4 ] -> false
        [ 1 4 4 1 1 4 3 ] -> false

 */

public class Two {

    public static void main(String[] args) {
        final boolean Two = loadTwo (new int[]{1, 1, 1, 1, 1, 4}); // исходя из задания true или false нужен
        System.out.println(Two);
    }

    public static boolean loadTwo (int[] arr) {
        boolean ONE = false;
        boolean FOUR = false;
        for (int i: arr) {
            if(i != 1 && i!=4) throw new RuntimeException("ошибка");
            if(i == 1) ONE = true;
            if(i == 4) FOUR = true;
        }
        return ONE && FOUR;
    }

}
