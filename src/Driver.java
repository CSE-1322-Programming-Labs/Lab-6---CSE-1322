import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibIteration fibIter = new FibIteration();
        FibFormula fibForm = new FibFormula();
        System.out.println("Enter the number you want to find the Fibonacci Series for: ");
        boolean testPassed = false;
        while(!testPassed) {
            String userInput;
            userInput = sc.next();
            try{
                int input = Integer.parseInt(userInput);
                System.out.println("Fib of "+input+" by iteration is: "+fibIter.calculateFib(input));
                System.out.println("Fib of "+input+" by formula is "+fibForm.calculateFib(input));
                testPassed = true;
            }catch(Exception e){
                System.out.println("Invalid input");
            }
        }
    }
}

