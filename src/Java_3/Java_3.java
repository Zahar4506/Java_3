package Java_3;

/**
 * Created by Zaharov Alex on 21.02.2016.
 * 3.	Создайте массив из 15 случайных целых чисел из отрезка [0;9].
 * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
 * и выведете это количество на экран на отдельной строке
 */
public class Java_3 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        for (int i = 0; i < 15; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.println(mas[i]);
        }
        System.out.println();
        int j = 0;
        for (int i = 0; i < 15; i++) {
            if (mas[i] % 2 == 0) {
                j++;
            }
        }
        System.out.print(j);
    }
}
