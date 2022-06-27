public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String passwword, String email) {
        this.username = username;
        this.password = passwword;
        this.email = email;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return username + " - " + password + " - " + email;
    }
}
