public class History {
    private String content;
    private String accountNumber;
    private double money;

    public History() {
    }

    public History(String content, String accountNumber, double money) {
        this.content = content;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    @Override
    public String toString() {
        return content + " - " + accountNumber + " - " + money;
    }
}
