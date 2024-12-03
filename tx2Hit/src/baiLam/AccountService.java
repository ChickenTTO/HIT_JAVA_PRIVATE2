package baiLam;

import java.util.List;

/**
 *
 * @author datch
 */
public interface AccountService {
    List<Account> getAllAccount();
    void createNewAccount(Account account);
    Account getAccountByUsername(String username);
    void deleteAccount(String username);
    void changeStatus(String username, Status status);
}
