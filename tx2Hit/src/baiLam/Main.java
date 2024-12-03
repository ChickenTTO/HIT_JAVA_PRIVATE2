package baiLam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author datch
 */
public class Main {

    public static void main(String[] args) {       
        AuthService authService = new AuthService();
        AccountService account = new AccountServiceImpl();
        Scanner s = new Scanner(System.in);
        List<Account> saccount = new ArrayList<>();
        saccount.add(new Account("Dat123", "Dat@123", Role.ADMIN, Status.ACTIVE, "AD01", "Nguyen Thanh Dat", 19, null, "21/10/2005"));
        saccount.add(new Account("NPC123", "NPC@123", Role.USER, Status.ACTIVE, "CUSTOMER01", "NPC", 99, null, null));
        Account currentUser = null;

        while (currentUser == null) {
            System.out.print("Nhap username: ");
            String userName = s.nextLine();
            System.out.print("Nhap password: ");
            String passWord = s.nextLine();

            for (Account accountss : saccount) {
                if (accountss.getUserName().equals(userName) && accountss.getPassWord().equals(passWord)) {
                    if (accountss.getStatus() == Status.BAN) {
                        System.out.println("Tai khaon bi BAN.");
                        break;
                    }
                    currentUser = accountss;
                    break;
                }
            }

            if (currentUser == null) {
                System.out.println("Sai tai khoan hoac mat khau thu lai.");
            }
        }

        System.out.println("Da dang nhap!");
        
        if (currentUser.getRole() == Role.ADMIN) {
            menuAdmin(s, authService, account, currentUser);
        } else if (currentUser.getRole() == Role.USER) {
            menuCustomer(s, authService, currentUser);
        }

        
    }

    public static void menuAdmin(Scanner s, AuthService authService, AccountService accountService, Account currentAccount) {
        int luachon = 0;
        do {
            System.out.println("=== HE THONG QUAN LY TAI KHOAN ===");
            System.out.println("Xin chao ADMIN: [username cua admin]");
            System.out.println("Chon mot trong cac chuc nang sau: ");
            System.out.println("1. Xem danh sach tai khoan");
            System.out.println("2. Tao tai khoan moi");
            System.out.println("3. Tim kiem tai khoan theo username");
            System.out.println("4. Xoa tai khoan");
            System.out.println("5. Thay doi trang thai tai khoan");
            System.out.println("6. Xem thong tin dang nhap");
            System.out.println("0. Dang xuat");
            System.out.print("Lua chon cua ban la: ");
            luachon = s.nextInt();
            s.nextLine();

            switch (luachon) {
                case 1:
                    accountService.getAllAccount();
                    break;
                case 2:
                    accountService.createNewAccount(currentAccount);
                    break;
                case 3:
                    System.out.print("Nhap ten can tim :");
                    String tname = s.nextLine();
                    accountService.getAccountByUsername(tname);
                    break;
                case 4:
                    System.out.print("Nhap ten tai khoan muon xoa: ");
                    String sname = s.nextLine();
                    accountService.deleteAccount(sname);
                    break;
                case 5:
                    System.out.println("HE THONG DANG BAO TRI :))))");
                    break;
                case 6:
                    System.out.println(currentAccount);
                    break;
                case 0:
                    authService.logout();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (luachon != 0);
    }

    public static void menuCustomer(Scanner s, AuthService authService, Account currentAccount) {
        int luachon = 0;
        do {
            System.out.println("=== HE THONG NGUOI DUNG ===");
            System.out.println("Xin chao USER: [username cua user]");
            System.out.println("Chon mot trong cac chuc nang sau: ");
            System.out.println("1. Doi mat khau");
            System.out.println("2. Xem thong tin");
            System.out.println("0. Dang xuat");
            System.out.print("Lua chon cua ban la: ");
            luachon = s.nextInt();
            s.nextLine();

            switch (luachon) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name=s.nextLine();
                    System.out.print("Nhap mk cu: ");
                    String oldPassWord = s.nextLine();
                    System.out.print("Nhap mk moi: ");
                    String newPassWord = s.nextLine();
                    authService.changePassword(name, oldPassWord, newPassWord);
                    break;
                case 2:
                    System.out.println(currentAccount);
                    break;
                case 0:
                    authService.logout();
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (luachon != 0);
    }
}
