package Java_3;

/**
 * Created by  Zaharov Alex on 21.02.2016.
 * 2.	Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)
 */
public class Lab_2 {
    public static void main(String[] args) {
        int[] mas = new int[50];
        int j = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                mas[j] = i;
                j++;
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 49; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }
}
