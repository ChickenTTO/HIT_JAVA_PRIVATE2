package baiLam;

import java.util.Scanner;

/**
 *
 * @author datch
 */
public class AuthService implements IAuthService{

    private Account currentAccount;
    
    @Override
    public void login(Scanner Scanner) {
        System.out.print("Nhap ten dang nhap: ");
        String userName = Scanner.nextLine();
        System.out.print("Nhap mat khau: ");
        String passWord = Scanner.nextLine();
        
        if("admin".equals(userName) && "admin".equals(passWord))
        {
            currentAccount = new Account("Dat123", "Dat@123", Role.ADMIN, Status.ACTIVE, "AD1", "Nguyen Thanh Dat", 19,null, "21/10/2005");
            System.out.println("Dang nhap thanh cong");
        }else{
            System.out.println("Sai ten dang nhap hoac mat khau");
        }
    }

    @Override
    public void logout() {
        currentAccount = null;
        System.out.println("Dang xuat thanh cong");
    }

    @Override
    public void changePassword(String name, String oldPassWord, String newPassWord) {
        if(currentAccount != null && currentAccount.getUserName().equals(name) && currentAccount.getPassWord().equals(oldPassWord)){
            currentAccount.setPassWord(newPassWord);
            System.out.println("Doi mat khau thanh cong");
        }else{
            System.out.println("Tai khoan khong ton tai");
        }
    }
    
}
