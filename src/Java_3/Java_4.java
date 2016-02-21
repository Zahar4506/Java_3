package Java_3;

/**
 * Created by Zaharov Alex on 21.02.2016.
 * 4.	Создать двумерный массив из 8 строк по 5 столбцов в каждой
 * из случайных целых чисел из отрезка [10;99]. Вывести массив на экран
 */
public class Java_4 {
    public static void main(String[] args) {
        int[][] mas = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                mas[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
    }
}
