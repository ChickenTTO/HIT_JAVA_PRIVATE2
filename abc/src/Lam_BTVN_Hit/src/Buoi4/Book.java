
package Buoi4;

import java.util.Scanner;


public class Book {
    private int maSach;
    private String tenSach;
    private String tenTacGia;
    private int namSanXuat;
    private String tomTatNoiDung;
    private double giaTien;

    public Book() {
    }

    public Book(int maSach, String tenSach, String tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return maSach + "\t" + tenSach + "\t" + tenTacGia + "\t" + namSanXuat + "\t" + tomTatNoiDung + "\t" + giaTien ;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập mã sách :");
        maSach = sc.nextInt();
        System.out.println(" nhập váo tên sách:");
        tenSach = sc.nextLine();
        System.out.println(" nhập vào tên tác giả:");
        tenTacGia = sc.nextLine();
        System.out.println(" nhập vào năm SX:");
        namSanXuat = sc.nextInt();
        System.out.println(" tóm tắt ND:");
        tomTatNoiDung = sc.nextLine();
        System.out.println(" nhập vào giá tiền:");
        giaTien = sc.nextDouble();
    }
    public void output()
    {
        System.out.println("Ma sach"+"\t"+"Ten sach"+"\t"+"Tac gia"+"\t"+"Nam sx"+"\t"+"Tom tat"+"\t"+"Gia");
    }
}
