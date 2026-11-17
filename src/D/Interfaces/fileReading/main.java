package D.Interfaces.fileReading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List <product> productList = infoReader.loadProduct();

        for (product  p : productList) {
            Double finalPrice = p.finalValue();

            try (BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\maria\\IdeaProjects\\javaStudy\\src\\D\\Interfaces\\fileReading\\out\\summary.csv", true))) {
                br.write("Product: "+p.getName() + "\nFinal Price: " +p. finalValue());
                br.newLine();

            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }


    }

}
