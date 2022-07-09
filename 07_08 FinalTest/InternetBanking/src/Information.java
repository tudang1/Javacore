public class Information {
    private String phoneNumber;
    private String accountNumber;
    private String password;
    private double money;

    public Information() {
    }

    public Information(String phoneNumber, String accountNumber, String password, double money) {
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.password = password;
        this.money = money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
