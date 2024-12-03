package baiLam;

/**
 *
 * @author datch
 */
public class Account extends Person {
    private String userName;
    private String passWord;
    private Role role;
    private Status status;

    public Account() {
    }

    public Account(String userName, String passWord, Role role, Status status, String id, String fullName, int age, Address address, String birthday) {
        super(id, fullName, age, address, birthday);
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "userName=" + userName + ", passWord=" + passWord + ", role=" + role + ", status=" + status + '}';
    }
    
    
}
