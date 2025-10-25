package ExercicioFixacao.model.services;

import ExercicioFixacao.model.entities.Contract;
import ExercicioFixacao.model.entities.Installment;
import ExercicioFixacao.model.interfaces.OnlinePaymentService;

import java.time.LocalDate;
import java.util.Date;

public class ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicInstallment = contract.getTotalValue() / months;

        for(int i = 1; i<= months; i++){
            double interest = this.onlinePaymentService.interest(basicInstallment, i);
            double paymentFee = this.onlinePaymentService.paymentFee(basicInstallment + interest);
            double fullInstallment = basicInstallment + interest + paymentFee;

            LocalDate dueDate= contract.getDate().plusMonths(i);

            contract.getInstallments().add(new Installment(dueDate, fullInstallment));
        }
    }
}
