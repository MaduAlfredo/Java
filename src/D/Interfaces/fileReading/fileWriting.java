package D.Interfaces.fileReading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriting {
    public static void main(String[] args) {


        String[] teams = new String[] { "San Jose Sharks", "Seattle Kraken ", "New York Rangers"};
        //For this exercise I'm using  nhl teams names
        String path = "C:\\Users\\maria\\IdeaProjects\\javaStudy\\src\\D\\Interfaces\\text.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String team : teams) {
                bw.write(team);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

}
