package baiLam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author datch
 */
public class AccountServiceImpl implements AccountService {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public List<Account> getAllAccount() {
        return accounts;
    }

    @Override
    public void createNewAccount(Account account) {
        accounts.add(account);
        System.out.println("Da tao");
    }

    @Override
    public Account getAccountByUsername(String username) {
        for (Account account : accounts) {
            if (account.getUserName().equals(username)) {
                return account;
            }

        }
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        for (Account account : accounts) {
            Account saccount = getAccountByUsername(username);
            if (saccount != null) {
                if (account.getUserName().equals(username)) {
                    accounts.remove(account);
                    System.out.println("Xoa roi");
                } 
                else {
                    System.out.println("Khong thay tai khoan ten" + username);
                }
            }
        }
    }

    @Override
    public void changeStatus(String username, Status status) {
        
    }

}
