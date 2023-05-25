class Account {
    private String ssn;
    private long balance;
    private String password;

    Account(String ssn, long balance) {
        this.ssn = ssn;
        this.balance = balance;
    }

    void printInfo() {
        System.out.println(this.ssn);
        System.out.println(this.balance);
    }

    String getSsn() {
        return ssn;
    }
    long getBalance() {
        return balance;
    }
    void setSsn(String ssn) {
        this.ssn = ssn;
    }
    void setBalance(long balance) {
        this.balance = balance;
    }
}

public class C2 {
    public static void main(String[] args) {
        Account a = new Account("123123-1231231", 10000L);
        a.printInfo();

        a.setSsn("321321-3213213");
        a.setBalance(10000000000L);
        a.printInfo();
    }
}
