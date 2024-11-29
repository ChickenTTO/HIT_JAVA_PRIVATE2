package quanLy;

/**
 *
 * @author datch
 */
public class User {
    private int id;
    private String fullName;
    private String userName;
    private String password;
    private Role role;

    public User(int id, String fullName, String userName, String password, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return id + "\t" + fullName + "\t" + userName + "\t" + role;
    }
    
    
}
