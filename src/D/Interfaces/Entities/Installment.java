package D.Interfaces.Entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public  Installment(){};

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return
                "Amount: " + amount +
                " Due date:" + dueDate +"\n";
    }
}
