package Gabriela;
public class StringCalculator {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add("")); 
        System.out.println(calculator.add("1")); 
        System.out.println(calculator.add("1.5,30.5")); 
    }
         public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
    
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
    
        String[] parts = numbers.split(delimiter);
        int sum = 0;
        StringBuilder negatives = new StringBuilder();
    
        for (String part : parts) {
            int number = Integer.parseInt(part.trim());
            if (number < 0) {
                negatives.append(number).append(" ");
            } else {
                sum += number;
            }
        }
    
        if (negatives.length() > 0) {
            throw new IllegalArgumentException("Negatives not allowed: " + negatives.toString().trim());
        }
    
        return sum;
    }
