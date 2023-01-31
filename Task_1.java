/*Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа. */


package HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> random_nums = new ArrayList<>(); 
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            random_nums.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println(random_nums);
        for (int i = 0; i < random_nums.size(); i++) {
            if (random_nums.get(i) % 2 == 0) {
                random_nums.remove(i);
                i--;
            }
        }
        System.out.println("=>");
        System.out.println(random_nums);
        
    }
    
}
