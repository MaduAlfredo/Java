package D.Interfaces.Service;

import D.Interfaces.Interface.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

    private Double paymentFee = 0.02;
    private Double installmentTax = 0.01;

    @Override
    public Double paymentFee(Double paymentBaseValue) {
        return paymentFee * paymentBaseValue;
    }
    public Double interest (Double paymentBaseValue, Integer months) {
        return installmentTax * paymentBaseValue * months;
    }
}
