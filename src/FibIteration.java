public class FibIteration implements FindFib{

    @Override
    public int calculateFib(int input) {
        if(input<=0) return -1;
        if(input == 1 || input == 2) return 1;

        int fib =0;
        int firstPreviousNum = 1;
        int secondPreviousNum = 1;
        for(int i=3;i<=input;i++){
            fib = (firstPreviousNum + secondPreviousNum);
            firstPreviousNum = secondPreviousNum;
            secondPreviousNum = fib;
        }
        return fib;
    }
}
