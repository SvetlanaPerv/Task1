package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static ArrayList<Integer> createList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++)
            list.add((int) (Math.random()*50));
        return list;
    }

    public static void printList(ArrayList<Integer> list){
        for (int k: list)
            System.out.print(k+" ");
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        ArrayList<Integer> list1 = createList();

        System.out.print("Исходный список: ");
        printList(list1);

        int i=list1.size()/2;
        while (i>0){
            int k=list1.get(0);
            list1.remove(0);
            list1.add(k);
            i--;
        }

        System.out.print("\nРезультирующий список: ");
        printList(list1);


        System.out.println("\n\nЗадача 2");
        ArrayList<Integer> list2 = createList();

        System.out.print("Исходный список: ");
        printList(list2);

        // удалить четные
        for (i=0; i<list2.size();)
            if (list2.get(i)%2==0)
                list2.remove(i);
            else i++;

        System.out.print("\nРезультирующий список: ");
        printList(list2);


        System.out.println("\n\nЗадача 3");
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int k: list1){
            if (k%2==0)
                list3.add(k);
            else
                list4.add(k);
        }
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("четные", list3);
        map.put("нечетные", list4);

        System.out.print("Исходный список  для Map: ");
        printList(list1);

        for (Map.Entry<String, List<Integer>> pair: map.entrySet()){
            System.out.print("\n"+pair.getKey()+": ");
            for (int k: pair.getValue()){
                System.out.print(k+" ");
            }
        }
    }
}
