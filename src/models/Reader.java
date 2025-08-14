package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String filePath = "src/utils/formulario.txt";

    public List<String> getData() {
        List<String> arr = new ArrayList<String>();
        BufferedReader bf = null;
        try {

            FileReader fileReader = new FileReader(filePath);
            bf = new BufferedReader(fileReader);
            String line = bf.readLine();
            
            while (line != null) {
                arr.add(line);
                line = bf.readLine();
            }

            return arr;

        } catch (Exception err) {
            System.out.println("Erro");
        }

        return null;
    }
}
