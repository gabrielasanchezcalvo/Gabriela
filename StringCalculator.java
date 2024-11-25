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
        for (String part : parts) {
            sum += Integer.parseInt(part.trim());
        }
        return sum;
    }
    
