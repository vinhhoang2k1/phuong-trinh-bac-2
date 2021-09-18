package baitap268;

import java.util.*;
// Nhập vào a, b, c
// - Giải phươn trình bac 2 ax^2 +bx =c

public class bai2 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("moi ban nhap 3 so a,b,c cua phuong trinh: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap a:");
        a = scan.nextFloat();
        System.out.print("nhap b:");
        b = scan.nextFloat();
        System.out.print("nhap c:");
        c = scan.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
