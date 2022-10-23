package ru.home.task.task1;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        System.out.println(arrayList);
        arrayList.add(0, 5);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());
        arrayList.set(0, 15);
        System.out.println(arrayList);
        arrayList.delete(0);
        System.out.println(arrayList);
        arrayList.add(1);
        arrayList.add(18);
        arrayList.add(12);
        arrayList.add(24);
        arrayList.delete(24);
        System.out.println(arrayList);
        System.out.println(arrayList.index(12));

        }
    }












