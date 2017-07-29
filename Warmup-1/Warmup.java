import java.util.*;

public class Warmup {
  public static void main(String[] args){
    System.out.println(sleepIn(false, false));
    System.out.println(monkeyTrouble(false, false));
    System.out.println(sumDouble(2,2));
    System.out.println(diff21(34));
    System.out.println(parrotTrouble(true,8));
    System.out.println(makes10(2,8));
  }

  public static boolean sleepIn(boolean weekday, boolean vacation) {
    if(!weekday || vacation)
      return true;
      return false;
  }

  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return !(aSmile ^ bSmile);
  }

  public static int sumDouble(int a, int b) {
    if(a==b)
      return a*4;
    return a+b;
  }

  public static int diff21(int n) {
    if(n > 21)
      return 2*(n-21);
    return 21-n;
  }

  public static boolean parrotTrouble(boolean talking, int hour) {
    if(talking && (hour<7 || hour>20))
      return true;
    return false;
  }

  public static boolean makes10(int a, int b) {
    if(a==10 || b==10 || a+b==10)
      return true;
    return false;
  }
}
