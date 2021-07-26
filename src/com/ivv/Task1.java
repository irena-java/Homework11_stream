package com.ivv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer>arrayList=generateRandomArray(5);
        System.out.println("Список случайных чисел: "+arrayList.toString());
        int sumOfSquars=arrayList.stream()
                .map(x->x*x)
                .reduce((x1,x2)->x1+x2).orElse(0);
        System.out.println("Сумма квадратов: "+sumOfSquars);
    }

    private static List<Integer> generateRandomArray(int length) {
        Random random=new Random();
        List<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayList.add(random.nextInt(10));
        }
        return arrayList;
    }
}