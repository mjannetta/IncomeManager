public class Transaction {
    public TransactionType transactionType;
    public double amount;
    public String name;
    public String notes;

    public Transaction(TransactionType transactionType, double amount, String name, String notes) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.name = name;
        this.notes = notes;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
