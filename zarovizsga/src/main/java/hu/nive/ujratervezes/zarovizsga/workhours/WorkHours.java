package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    private List<Worker> result = new ArrayList<>();

    public String minWork(String file) {
        readFromFile(file);
        int min = 100;
        int index = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getWorkHour() < min) {
                min = result.get(i).getWorkHour();
                index = i;
            }
        }
        return result.get(index).toString();
    }

    private void readFromFile(String file) {
        try {
            BufferedReader reader = Files.newBufferedReader(Path.of(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int hours = Integer.parseInt(parts[1]);
                String date = parts[2];
                result.add(new Worker(name, hours, date));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }
}
