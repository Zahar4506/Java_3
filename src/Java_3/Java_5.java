package Java_3;

/**
 * Created by Zaharov Alex on 22.02.2016.
 * 5.	Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки
 * с наибольшим по модулю произведением элементов. Если таких строк несколько,
 * то вывести индекс первой встретившейся из них
 */
public class Java_5 {
    public static void main(String[] args) {
        int[][] mas = new int[7][4];
        int max = 1, st = 1, n = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                mas[i][j] = (int) (Math.random() * 11 - 5);
                System.out.print(mas[i][j] + " ");
                max = Math.abs(max * mas[i][j]);
            }
            if (max > n) {
                n = max;
                st = i+1;
            }
            System.out.println();

           // System.out.println(max+" "+n);
            max=1;

        }
        System.out.println(st);
    }
}
