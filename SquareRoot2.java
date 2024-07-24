import java.util.Scanner;
public class SquareRoot2{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      int num = sc.nextInt();
      System.out.println(squareroot(num));
    }
    public static double squareroot(int num){
        double sqrt = num/2;
        double t = 0;
        while((t-sqrt)!=0){
            t = sqrt;
            sqrt = (t+(num/t))/2;
        }
        return sqrt;
    }
}
    
