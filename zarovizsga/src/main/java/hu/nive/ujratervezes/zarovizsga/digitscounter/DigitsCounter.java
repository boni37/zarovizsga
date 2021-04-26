package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class DigitsCounter {

    public int getCountOfDigits(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                String s = String.valueOf(numbers.charAt(i));
                if (!sb.toString().contains(s)) {
                    sb.append(s);
                    count += 1;
                }
            }
        }
        return count;
    }
}
