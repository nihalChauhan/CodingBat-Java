import java.util.*;

public class Recursion {
  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(bunnyEars(10));
    System.out.println(triangle(5));
    System.out.println(sumDigits(123));
    System.out.println(count7(172737));
    System.out.println(count8(182884));
    System.out.println(powerN(4,2));
    System.out.println(countX("xxabxx"));
    System.out.println(countHi("ihihiabhi3"));
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

  public static int powerN(int base, int n){
    if(n==0) return 1;
    return base*powerN(base, n-1);
  }

  public static int countX(String str){
    if(str.length()==0) return 0;
    if(str.charAt(str.length()-1)=='x') return 1+countX(str.substring(0, str.length()-1));
    return countX(str.substring(0, str.length()-1));
  }

  public static int countHi(String str) {
    if(str.length()==1 || str.length()==0) return 0;
    if(str.charAt(str.length()-2)=='h' && str.charAt(str.length()-1)=='i')
      return 1+countHi(str.substring(0, str.length()-2));
    return countHi(str.substring(0, str.length()-1));
  }
}
