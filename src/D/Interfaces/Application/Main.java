package D.Interfaces.Application;

import D.Interfaces.Entities.Contract;
import D.Interfaces.Service.ContractReader;
import D.Interfaces.Service.ContractService;
import D.Interfaces.Service.PaypalService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContractService ct = new ContractService(new PaypalService());

        System.out.println("Welcome! \nInsert your contract number: ");
        Integer ctNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Over how many months would you like to pay in installments? ");
        Integer months = sc.nextInt();
        sc.nextLine();


        List <Contract> contracts = ContractReader.loadContractList();

        for (Contract contract : contracts){
            if (contract.getContractNumber().equals(ctNumber)){
                ct.processContract(contract, months);
                System.out.println(contract);
            }

        }

    }

}
