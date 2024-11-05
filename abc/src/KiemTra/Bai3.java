package KiemTra;

import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap so thuc x: ");
        double x=s.nextDouble();
        System.out.print("Nhap so nguyen y: ");
        int y=s.nextInt();

        double p=1;

        for (int i = 0; i < y; i++) {
            p=(double)p*x;
        }

        System.out.print(x+" mu "+y+" la:"+p);
    }
}

