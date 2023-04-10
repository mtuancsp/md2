package p16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {

    public static void main(String[] args) {
        String filePath = "countries.csv";
        List<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String code = values[1];
                String name = values[2];
                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}

class Country {
    private final int id;
    private final String code;
    private final String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country {" +
                " id = " + id +
                ", code = " + code +
                ", name = " + name +
                " }";
    }
}
