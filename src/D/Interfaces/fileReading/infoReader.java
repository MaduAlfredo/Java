package D.Interfaces.fileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class infoReader {

    private static String file = "C:\\Users\\maria\\IdeaProjects\\javaStudy\\src\\D\\Interfaces\\fileReading\\productInfo.csv";

    public static List<product> loadProduct() {
        List<product> productList = new ArrayList<>();

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quant = Integer.parseInt(fields[2]);

                product p = new product(name, price, quant);

                productList.add(p);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return productList;
    }
}