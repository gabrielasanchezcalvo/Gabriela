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

        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Double.parseDouble(part.trim());
        }
        return sum;
    }
    
