public class SumBetNumbers {
    public static void main(String[] args) {
        int i = 0, j = 4;
        int sum = 0;
        
        for (int num = i + 1; num < j; num++) {
            sum += num;
        }
        
        System.out.println("Sum of numbers between " + i + " and " + j + " is: " + sum);
    }
}
