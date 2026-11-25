package D.Interfaces.Service;

import D.Interfaces.Entities.Contract;
import D.Interfaces.Entities.Installment;
import D.Interfaces.Interface.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService{

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, Integer months) {
        Double paymentBaseValue  = contract.getTotalValue()/months;

        for (int i = 1; i<=months;i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(paymentBaseValue, i);

            Double paymentFee = onlinePaymentService.paymentFee(paymentBaseValue + interest);

            Double paymentFinalValue = paymentBaseValue + interest + paymentFee;

            Installment installment = new Installment(dueDate, paymentFinalValue);

            contract.getInstallments().add(installment);


        }
    }




}
