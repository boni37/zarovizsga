package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WorkHours {

    private List<WorkRecord> workRecordList = new ArrayList<>();

    public String minWork(String filename) {
        List<WorkRecord> workRecordList = new ArrayList<>();
        workRecordList = createListOfWorks(filename, workRecordList);
        Collections.sort(workRecordList);
        return workRecordList.get(0).toString();
    }

    private List<WorkRecord> createListOfWorks(String filename, List<WorkRecord> workRecordList) {
        Path file = Path.of(filename);
        try(BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while((line= reader.readLine())!=null){
                String[] workRecords = line.split(",");
                String name = workRecords[0];
                int workhour = Integer.parseInt(workRecords[1]);
                String[] partDate = workRecords[2].split("-");
                int year = Integer.parseInt(partDate[0]);
                int month = Integer.parseInt(partDate[1]);
                int day = Integer.parseInt(partDate[2]);
                LocalDate workdate = LocalDate.of(year,month,day);
                workRecordList.add(new WorkRecord(name,workhour,workdate));
            }
            return workRecordList;

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.",e);
        }
    }
}
