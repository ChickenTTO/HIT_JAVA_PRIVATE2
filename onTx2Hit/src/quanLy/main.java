package quanLy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author datch
 */
public class main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Dat", "Admin123", "admin@123", Role.ADMIN));
        users.add(new User(2, "NPC", "NPC123", "npc@123", Role.CUSTOMER));

        ProductManager productManager = new ProductManager();
        Scanner s = new Scanner(System.in);

        User currentUser = null;
        while (currentUser == null) {
            System.out.print("Nhap username: ");
            String username = s.nextLine();
            System.out.print("Nhap password: ");
            String password = s.nextLine();

            for (User user : users) {
                if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                    currentUser = user;
                    break;
                }
            }
            if (currentUser == null) {
                System.out.println("Sai ten dang nhap hoac mat khau!");
            }
        }

        System.out.println("Dang nhap thanh cong!");
        if (currentUser.getRole() == Role.ADMIN) {
            adminMenu(productManager, currentUser, s);
        } else {
            customerMenu(productManager, s);
        }
    }

    public static void adminMenu(ProductManager productManager, User user, Scanner s) {
        int choice = 0;
        do {
            System.out.println("===MENU DANH CHO ADMIN===");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Tim kiem san pham theo ten");
            System.out.println("4. Xoa san pham theo ma ");
            System.out.println("5. Cap nhat thong tin san pham");
            System.out.println("6. Thoat!");
            System.out.print("Lua chon cua ban la: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap id san pham: ");
                    String  id = s.nextLine();
                    s.nextLine();
                    System.out.print("Nhap ten san pham: ");
                    String name = s.nextLine();
                    System.out.print("Nhap so luong san pham: ");
                    int quantity = s.nextInt();
                    s.nextLine();
                    System.out.print("Nhap gia san pham: ");
                    double price = s.nextDouble();
                    productManager.addProduct(new PhysicalProduct(id, name, quantity, price), user);
                    break;
                case 2:
                    System.out.println("Ma SP" +"\t"+"Ten SP"+"\t"+"So Luong"+"\t"+"\t"+"Gia");
                    productManager.displayProduct();
                    break;
                case 3:
                    System.out.print("Nhap ten san pham can tim: ");
                    String ten = s.nextLine();
                    productManager.sortByName(ten);
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    String ma = s.nextLine();
                    productManager.delById(ma, user);
                    break;
                case 5:
                    System.out.print("Nhap ma san pham can sua: ");
                    String tma = s.nextLine();
                    productManager.updateProduct(tma, user, s);
                    break;
                case 6:
                    System.out.println("Da thoat!");
                    break;
                default:System.out.println("Lua chon khong hop le!");

            }
        } while (choice != 6);
    }

    public static void customerMenu(ProductManager productManager, Scanner s) {
        int choice = 0;
        do {
            System.out.println("===XEM SAN PHAM DANH CHO CUSTOMER===");
            System.out.println("1. Hien thi danh sach san pham");
            System.out.println("2. Tim kiem san pham theo ten");
            System.out.println("3. Thoat");
            switch (choice) {
                case 1:
                    productManager.displayProduct();
                    break;
                case 2:
                    System.out.print("Nhap ten san pham can tim kiem: ");
                    String tten = s.nextLine();
                    productManager.sortByName(tten);
                    break;
                case 3:
                    System.out.println("Da thoat!");
                    break;
                default:System.out.println("Lua chon khong hop le");
            }
        } while (choice != 3);
    }
}
