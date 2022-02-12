package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> a = new ArrayList<>();
        String[] s = scanner.nextLine().split("");
        Integer[] ay = new Integer[s.length];
        for (int i = 0;i<s.length;i++){
            ay[i]=Integer.parseInt(s[i]);
        }
        Collections.addAll(a,ay);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = D; i<ay.length; i++){
            arr.add(ay[i]);
        }
        for (int i =0; i<D; i++){
            arr.add(ay[i]);
        }
        System.out.println(arr);

    }
}
