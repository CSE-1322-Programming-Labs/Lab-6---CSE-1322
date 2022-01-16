public class FibFormula implements FindFib{

    @Override
    public int calculateFib(int input) {
        if(input<=0) return -1;
        if(input == 1 || input == 2) return 1;

        return (int)Math.round( ((Math.pow(((1f+Math.sqrt(5))/2f),input)) - (Math.pow(((1f-Math.sqrt(5))/2f),input))) / Math.sqrt(5));
    }
}
