public class BankAccount {

    private int balance;

    private boolean open = false;

    public void open() {
        this.open = true;
        this.balance = 0;
    }

    public int getBalance() throws BankAccountActionInvalidException {

        assertAccountIsOpen();
        return balance;
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException {

        assertAccountIsOpen();
        assertAmountIsNotNegative(amount);
        this.balance += amount;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {

        assertAccountIsOpen();
        assertAmountIsNotNegative(amount);
        assertTransactionIsValid(amount);
        this.balance -= amount;
    }

    public void close() {
        this.open = false;
    }

    private void assertTransactionIsValid(int amount) throws BankAccountActionInvalidException {

        if(this.balance == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        }
        else if(this.balance < amount) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }

    }

    private void assertAccountIsOpen() throws BankAccountActionInvalidException {
        if(!open) {
            throw new BankAccountActionInvalidException("Account closed");
        }
    }

    private void assertAmountIsNotNegative(int amount) throws BankAccountActionInvalidException {
        if(amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
    }
}