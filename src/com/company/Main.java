package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numbers;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra :");
        numbers = scanner.nextInt();
        for (int i = 2; count <= numbers ; i++) {
            boolean check = true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
