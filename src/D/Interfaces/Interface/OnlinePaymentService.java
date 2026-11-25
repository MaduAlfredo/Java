package D.Interfaces.Interface;

public interface OnlinePaymentService {
     Double paymentFee(Double paymentBaseValue);
     Double interest(Double paymentBaseValue, Integer months);
}
