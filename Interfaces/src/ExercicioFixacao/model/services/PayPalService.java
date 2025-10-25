package ExercicioFixacao.model.services;

import ExercicioFixacao.model.interfaces.OnlinePaymentService;

public class PayPalService implements OnlinePaymentService {

    private static final Double MONTHLY_INTEREST = 0.01;
    private static final Double PAYMENT_FEE = 0.02;

    @Override
    public double paymentFee(Double amount){
        return amount * PAYMENT_FEE;
    }

    @Override
    public double interest(Double amount, Integer months){
        return amount * MONTHLY_INTEREST * months;
    }
}
