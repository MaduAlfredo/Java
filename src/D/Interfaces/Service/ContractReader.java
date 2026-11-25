package D.Interfaces.Service;

import D.Interfaces.Entities.Contract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractReader {

    private static  String file = "C:\\Users\\maria\\IdeaProjects\\javaStudy\\src\\D\\Interfaces\\Resources\\contracts.csv";

    public static List<Contract> loadContractList() {
        List <Contract> contractList = new ArrayList<>();

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            while((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                Integer contractNumber = Integer.parseInt(fields[0]);
                LocalDate contractDate = LocalDate.parse(fields[1]);
                Double contractValue = Double.parseDouble(fields[2]);

                Contract contract = new Contract(contractNumber, contractDate, contractValue);

                contractList.add(contract);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return contractList;
    }
}
