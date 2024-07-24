public class NumberReverse{
    public static void main(String[] args){
        int n = 3456;
        int ReversedNumber = 0;
        while(n>0){
            int ld = n%10;
            n=n/10;
            ReversedNumber = ReversedNumber*10+ld;
        }
        System.out.println("The Reversed Number is:"+" "+ReversedNumber);
    }
}
