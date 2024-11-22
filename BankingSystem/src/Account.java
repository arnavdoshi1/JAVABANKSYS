class Account {
    private String owner;
    private double balance;

    public Account(String owner, double initialDeposit) {
        this.owner = owner;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}