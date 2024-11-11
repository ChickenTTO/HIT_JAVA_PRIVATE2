package Buoi4;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Book bo = new Book();
        int n = 5;
        Book[] b = new Book[5];
        b[0] = new Book(1, "Toan", "A", 2020, "aaaaa", 20);
        b[1] = new Book(2, "Ly", "B", 2022, "bbbbb", 30);
        b[2] = new Book(3, "Hoa", "C", 2021, "ccccc", 50);
        b[3] = new Book(4, "Anh", "D", 2011, "ddddd", 240);
        b[4] = new Book(5, "Van", "E", 2010, "eeeee", 90);

        bo.output();
        for (Book book : b) {
            System.out.println(book);
        }
        int choose = 0;
        do {
            System.out.println("=== Book Manage ===");
            System.out.println("1. Them sach moi");
            System.out.println("2. Sua thong tin sach");
            System.out.println("3. Cuon sach lau doi nhat");
            System.out.println("4. In ra cuon sach phu hop nguoi mua nhap");
            System.out.println("5. Sap xe sach theo gia tien");
            System.out.println("6. Thoat!");
            System.out.println("Lua chon cua ban:");
            choose = s.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("So sach can them: ");
                    int add = s.nextInt();
                    int size = n + add;

                    Book[] st1 = new Book[size];
                    for (int i = 0; i < n; i++) {
                        st1[i] = b[i];
                    }
                    for (int i = n; i < size; i++) {
                        st1[i] = new Book();
                        st1[i].input();
                    }
                    for (Book book : st1) {
                        book.output();
                    }
                    break;

                case 2:
                    System.out.print("Nhap thu tu muon sua: ");
                    int stt = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (i == stt) {
                            b[i].input();
                        }
                    }
                    for (Book book : b) {
                        book.output();
                    }
                    break;

               
                case 4:
                    System.out.print("Nhap gia tien mong muon: ");
                    double giaTienMuon = s.nextDouble();
                    boolean sach1 = false;
                    for (Book book : b) {
                        if (book.getGiaTien() <= giaTienMuon) {
                            System.out.println("Cuon sach phu hop la:");
                            book.output();
                            sach1 = true;
                            break;
                        }
                    }
                    if (!sach1) {
                        System.out.println("Khong tim thay sach phu hop.");
                    }
                    break;

                case 5:

                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (b[j].getGiaTien() > b[j + 1].getGiaTien()) {
                                Book temp = b[j];
                                b[j] = b[j + 1];
                                b[j + 1] = temp;
                            }
                        }
                    }

                    for (Book book : b) {
                        book.output();
                    }
            }
        } while (choose != 6);
    }
}
