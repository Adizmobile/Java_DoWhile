package com.company;

public class Main {

    public static void main(String[] args) {
        /*----------- Vòng Lặp Do While Với Điều Kiện Đúng ------------*/
        int tong = 0;
        int i = 0;
        do {
            tong = tong + i;
            i = i + 1;
        }while (i < 10);
        System.out.println("Tổng Vòng Lặp Do - While Với Điều Kiện Đúng :" + tong);

        /*----------- Vòng Lặp Do While Với Điều Kiện Sai Lần Đầu ------------*/

        do {
            tong = tong + i + 8;
            i = i + 1;
        }while (i < -10);
        System.out.println("Tổng Vòng Lặp Do - While Với Điều Kiện Sai Ngay Lần Đầu :" + tong);

    }
}
