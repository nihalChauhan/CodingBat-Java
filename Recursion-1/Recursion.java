import java.util.*;

public class Recursion {
  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(bunnyEars(10));
    System.out.println(triangle(5));
    System.out.println(sumDigits(123));
    System.out.println(count7(172737));
    System.out.println(count8(182884));  
  }

  public static int factorial(int n){
    if(n==1) return 1;
    return n*factorial(n-1);
  }

  public static int bunnyEars(int n){
    if(n==0) return 0;
    if(n%2==0) return 3 + bunnyEars(n-1);
    return 2 + bunnyEars(n-1);
  }

  public static int triangle(int rows){
    if(rows==0) return 0;
    return rows + triangle(rows-1);
  }

  public static int sumDigits(int n){
    if(n==0 || n==1) return n;
    return n%10 + sumDigits(n/10);
  }

  public static int count7(int n){
    if(n==0) return 0;
    if(n%10==7) return 1+count7(n/10);
    return count7(n/10);
  }

  public static int count8(int n){
    if(n==0) return 0;
    if(n%100 == 88) return 2+count8(n/10);
    if(n%10==8) return 1+count8(n/10);
    return count8(n/10);
  }
}
