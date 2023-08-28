import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Второе задание: " + "\n");
        //Второе задание
        int a = -5;
        int b = 20;
        System.out.println("Переменная a до присваивания = " + a);
        System.out.println("Переменная b до присваивания = " + b);
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("Переменная a после присваивания = " + a);
        System.out.println("Переменная b после присваивания = " + b + "\n");

        System.out.println("Третье задание: " + "\n");
        //Третье задание
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
        System.out.println("Список до изменений: " + list);
        int count = list.size() - 1;
        for (int i = 0; i < list.size() & count >= list.size() / 2; i++) {
            int getter = list.get(i);
            list.set(i, list.get(count));
            list.set(count, getter);
            count --;
        }
        System.out.println("Инвертированный список: " + list);
    }
}