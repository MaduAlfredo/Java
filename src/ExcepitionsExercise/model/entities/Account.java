package ExcepitionsExercise.model.entities;

public class Account {

    private Integer  number;
    private String holder;
    private Double balance;
    private Double withdrawLimit = 200.00;


    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account (){}

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void  deposit(Double amount) {
        balance += amount;

    }

    public void withdraw(Double amount) throws Exception {
        if (amount < balance) {
            throw  new Exception("Withdraws must be less or equal to the amount on the account! ");
        }
        if (amount > getWithdrawLimit()){
            throw  new Exception("Withdraws must be R$200,00 or less, per limit!");
        }

        balance -= amount;

    }
}
