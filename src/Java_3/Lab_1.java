package Java_3;

/**
 * Created by Zaharov Alex on 21.02.2016.
 * 1.	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива
 * на экран сначала в строку, отделяя один элемент от другого пробелом,
 * а затем в столбик (отделяя один элемент от другого началом новой строки).
 */
public class Lab_1 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int j = 0;
        for (int i = 2; i <= 20; i += 2) {
            mas[j] = i;
            j++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(mas[i]);
        }
    }
}
