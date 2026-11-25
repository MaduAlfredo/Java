package D.Interfaces.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer contractNumber;
    private LocalDate date;
    private Double  totalValue;

    public Contract(Integer contractNumber, LocalDate date, Double totalValue) {
        this.contractNumber = contractNumber;
        this.date = date;
        this.totalValue = totalValue;
    }

    private List <Installment> installments = new ArrayList<>();

    public Integer getContractNumber() {
        return contractNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contract information: Date ").append(getDate());
        sb.append("\nAmount: ").append(getTotalValue());
        sb.append("\nInstallments:\n");

        for (Installment installment : getInstallments()) {
            sb.append(installment);
        }

        return sb.toString();
    }
}
