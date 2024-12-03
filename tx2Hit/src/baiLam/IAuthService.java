package baiLam;
import java.util.Scanner;
/**
 *
 * @author datch
 */
public interface IAuthService {
    public void login(Scanner Scanner);
    public void logout();
    public void changePassword(String name, String oldPassWord, String newPassWord);
}
