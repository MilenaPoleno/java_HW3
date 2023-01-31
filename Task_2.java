/*Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка. */


package HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> random_nums = new ArrayList<>(); 
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            random_nums.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println(random_nums);
        int min = random_nums.get(0);
        int max = random_nums.get(0);
        double sum = 0;

        for (int i = 0; i < random_nums.size(); i++) {
            max = max < random_nums.get(i) ? random_nums.get(i) : max;
            min = min > random_nums.get(i) ? random_nums.get(i) : min;            
            sum += random_nums.get(i);
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Arithmetic mean = " + sum / random_nums.size());
    }
}
