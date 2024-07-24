import java.util.Scanner;
public class NumberCount{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      int num = sc.nextInt();
      int count = 0;
      while(num>0){
          int ld = num%10;
          num = num/10;
          count++;
          
      }
      System.out.println("Digit count ="+" "+count);
    }
}
