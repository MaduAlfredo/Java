package ExceptionsExercise;

import ExceptionsExercise.model.Exceptions.DomainExceptions;
import ExceptionsExercise.model.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! ");

        System.out.println("Please insert your account number");
        Integer accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Insert the name of the account holder: ");
        String accountName = sc.nextLine();


        System.out.println("Insert the initial balance: ");
        Double accountBalance = sc.nextDouble();

        Account account = new Account(accountNumber, accountName, accountBalance);

        System.out.println(account);



        sc.close();
    }

}
