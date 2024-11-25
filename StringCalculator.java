package Gabriela;
public class StringCalculator {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add("")); 
        System.out.println(calculator.add("1")); 
        System.out.println(calculator.add("1.5,30.5")); 
    }
    for (String part : parts) {
        int number = Integer.parseInt(part.trim());
        if (number > 1000) {
            continue;
        }
        sum += number;
    }

    if (numbers.startsWith("//")) {
        int delimiterIndex = numbers.indexOf("\n");
        String rawDelimiters = numbers.substring(2, delimiterIndex);
        numbers = numbers.substring(delimiterIndex + 1);
        delimiter = rawDelimiters.replace("[", "").replace("]", "");
    }


    
    

    
