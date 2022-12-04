// Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// Вставить элемент в список в первой позиции.
// Извлечь элемент (по указанному индексу) из заданного списка.
// Обновить определенный элемент списка по заданному индексу.
// Удалить третий элемент из списка.
// Поиска элемента в списке по строке.
// Создать новый список и добавить в него несколько елементов первого списка.
// Удалить из первого списка все элементы отсутствующие во втором списке.
// *Сортировка списка.
// *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

import java.util.*;
public class hw3 {

    public static void main(String[] args) {
        System.out.println("Create new List");
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("Красный");
        array1.add("Белый");
        array1.add("Синий");
        array1.add("Черный");
        array1.add("Желтый");
        System.out.println(array1);
        array1.forEach(i -> System.out.println(i));

        System.out.println("---2---");
            
        for (int i = 0; i < array1.size(); i++) {
            array1.set(i, array1.get(i) + "!");
            }
        System.out.println(array1);
        array1.add(0, "Холодный");

        System.out.println("---3---");
        array1.forEach(i -> System.out.println(i));
        System.out.println("---4---");
        System.out.println(array1.get(3));
        System.out.println("---5---");
        array1.set(4, "Квадратный");
        array1.forEach(i -> System.out.println(i));
        System.out.println("---6---");
        array1.remove(2);
        array1.forEach(i -> System.out.println(i));
        System.out.println("---7---");
        for (String i: array1) {
            if(i.equals("Холодный")) {
                System.out.println("Элемент найден.");
            }
        }
        System.out.println("---8---");
        ArrayList<String> array2 = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            array2.add(array1.get(i));
        }
        array2.forEach(e -> System.out.println(e));

        System.out.println("---9---");
        array1.retainAll(array2);
        array1.forEach(i -> System.out.println(i));
        
        System.out.println("---10---");
        Collections.sort(array2);
        array2.forEach(i -> System.out.println(i));
        System.out.println("---11---");
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for (int i = 0; i < 9000000; i++) {
            array3.add(i, 1);
        }
        LinkedList<Integer> array4 = new LinkedList<Integer>();
        for (int i = 0; i < 9000000; i++){
            array4.add(i, 1);
        }
        long start = System.currentTimeMillis();
        array3.add(0, 10);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        array4.add(0, 10);
        System.out.println(System.currentTimeMillis() - start);
        }



}

        
//         array1.add(new Integer(7));
//         array1.add(7);
//         array1.add(234);
//         array1.add(57);
//         int tmp = array1.get(3);
//         array1.size();
//         array1.set(2, 0);
//         array1.remove(1);
//         array1.remove(2);
//         //array1.ensureCapacity(100);

//         array1.clear();
//         for (int i = 0; i < 5; i++) {
//             array1.add(new Random().nextInt(10));
//         }

//         for (int i = 0; i < 3; i++) {
//             array2.add(new Random().nextInt(10));
//         }

// //        for (int i = 0; i < array1.size(); i++) {
// //            array1.remove(i);
// //        }

// //        for (Integer i: array1) {
// //            i = 35;
// //            System.out.println(i);
// //        }

// //        ListIterator<Integer> iterator = array1.listIterator(args.length/5);
// //        while (iterator.hasPrevious()) {
// //            Integer i = iterator.previous();
// //            if (i<20) iterator.remove();
// //        }

//         array1.forEach(i -> System.out.println(i));
//         System.out.println();
//         array2.forEach(i -> System.out.println(i));
//         System.out.println("----------------");
