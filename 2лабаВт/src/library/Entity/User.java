package library.Entity;

public class User {

    private String login;
    private String password;
    private  boolean admin;


    public User() {
    }

    public User(String login, String password, boolean admin) {
        this.login = login;
        this.password = password;
        this.admin = admin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(boolean admin) {
        this.admin = admin;
    }

    public String getLogin() { return login; }

    public String getPassword() {
        return password;
    }

    public boolean getRole() {
        return admin;
    }


}
