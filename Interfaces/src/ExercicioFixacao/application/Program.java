package ExercicioFixacao.application;

import ExercicioFixacao.model.entities.Contract;
import ExercicioFixacao.model.entities.Installment;
import ExercicioFixacao.model.interfaces.OnlinePaymentService;
import ExercicioFixacao.model.services.ContractService;
import ExercicioFixacao.model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        OnlinePaymentService payPalService = new PayPalService();
        ContractService service = new ContractService(payPalService);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        String dateString = sc.next();
        LocalDate date = LocalDate.parse(dateString, fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int totalInstallments = sc.nextInt();

        service.processContract(contract, totalInstallments);

        System.out.println("Parcelas:");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
