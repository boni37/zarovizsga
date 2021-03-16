package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.Map;
import java.util.TreeMap;

public class DigitsCounter {

    private String digitsPattern = "0123456789";


    public int getCountOfDigits(String digits) {
        if(digits==null || digits.isEmpty()) return 0;
        Map<Integer,Integer> digitNumbers = new TreeMap<>();
        String digitPatterns;
        for(int i=0; i< digits.length();i++){
            String digitInRow = String.valueOf(digits.charAt(i));

            if(digitsPattern.contains(digitInRow)){
                Integer keyDigit = Integer.parseInt(digitInRow);
                if(digitNumbers.containsKey(keyDigit)){
                    digitNumbers.put(keyDigit,digitNumbers.get(keyDigit)+1);
                }
                digitNumbers.put(keyDigit,1);
            }
        } return digitNumbers.size();
    }
}
