package com.company;

import java.util.Scanner;

//Viết hàm tính tiền đi taxi Mai Linh với số km đi được nhập từ bàn phím, biết:
//
//        Giá mở cửa: 14.000đ/ 0.8km.
//        Tiếp theo đến 25km: 16.300đ/ km.
//        Từ km thứ 26: 13.300đ/ km.

public class Main {

    public static void main(String[] args) {
        float km;
        Scanner scanner = new Scanner(System.in);
        long money = 0;
        final int Startting_Fee = 14000; // khai báo hằng số giá mở cửa
        final int Next_to_25Km = 16300; // từ km tiếp theo đến km 25;
        final int From_26Km = 13300; // Sau km 26

        System.out.println("Nhập số km b đã đi: ");
        km = scanner.nextFloat();
        if (km<0.8) {
            money = 14000;
        } else if (km<=25) {
            money = (long) (Startting_Fee + (km - 0.8)*Next_to_25Km);
        } else {
            money = (long) (Startting_Fee + Next_to_25Km*(25-0.8) + From_26Km*(km - 25 - 0.8));
        }

        System.out.println("Số tiền đi trong " + km + " là: " + money + "VND");
    }
}
